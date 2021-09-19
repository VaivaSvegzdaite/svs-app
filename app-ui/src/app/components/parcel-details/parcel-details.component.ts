import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {Parcel, ParcelService} from "../../services/parcel.service";

@Component({
  selector: 'app-parcel-details',
  templateUrl: './parcel-details.component.html',
  styleUrls: ['./parcel-details.component.css']
})
export class ParcelDetailsComponent implements OnInit {
  id!: number;
  parcel!: Parcel;
  parcels: Parcel[] = [];

  constructor(private parcelService: ParcelService, private activatedRoute: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.parcel = new Parcel(Number(''), '', Number(''), Object(''), Object(''));
    this.id = this.activatedRoute.snapshot.params['id'];
    this.parcelService.getParcel(this.id)
      .subscribe(data => {
        this.parcel = data;
      },);
  }

  removeParcel(parcel: Parcel): void {
    this.parcelService.deleteParcel(parcel)
      .subscribe(data => {
        this.parcels = this.parcels.filter(s => s !== parcel);
        this.router.navigate(['./parcels']).then();
        alert("Siunta ištrinta sėkmingai!");
      })
  };

}
