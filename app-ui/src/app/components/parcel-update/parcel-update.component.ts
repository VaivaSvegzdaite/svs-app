import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {Parcel, ParcelService} from "../../services/parcel.service";
import {Sender} from "../../services/sender.service";
import {Receiver} from "../../services/receiver.service";

@Component({
  selector: 'app-parcel-update',
  templateUrl: './parcel-update.component.html',
  styleUrls: ['./parcel-update.component.css']
})
export class ParcelUpdateComponent implements OnInit {

  id!: number;
  parcel!: Parcel;

  constructor(private parcelService: ParcelService, private route: ActivatedRoute, private router: Router) {
  }

  ngOnInit(): void {
    this.parcel = new Parcel(Number(''), '', Number(''),
      new Sender(Number(''), '', '', ''),
      new Receiver(Number(''), '', '', '', Number(''), ''));
    this.id = this.route.snapshot.params['id'];
    this.parcelService.getParcel(this.id).subscribe(data => {
      this.parcel = data;
    });
  }

  editParcel() {
    this.parcelService.updateParcel(this.id, this.parcel).subscribe();
    this.parcel = new Parcel(Number(''), '', Number(''),
      new Sender(Number(''), '', '', ''),
      new Receiver(Number(''), '', '', '', Number(''), ''));
    this.parcelsList();
  }

  parcelsList() {
    this.router.navigate(['/parcels']).then();
  }

}
