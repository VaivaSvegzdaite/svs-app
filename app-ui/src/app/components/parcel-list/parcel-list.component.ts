import { Component, OnInit } from '@angular/core';
import {Parcel, ParcelService} from "../../services/parcel.service";

@Component({
  selector: 'app-parcel-list',
  templateUrl: './parcel-list.component.html',
  styleUrls: ['./parcel-list.component.css']
})
export class ParcelListComponent implements OnInit {

  parcels!: Parcel[];
  isLoading = true;
  page = 1;
  pageSize = 5;
  collectionSize!: number;
  allSiuntos!: Parcel[];
  searchSiunta!: string;

  constructor(private parcelService: ParcelService) {
  }

  ngOnInit(): void {
    this.parcelService.getParcels().subscribe((data: Parcel[]) => {
      this.collectionSize = data.length;
      this.parcels = data;
      this.allSiuntos = this.parcels;
    })
    this.isLoading = false;
  }

  search(value: string): void {
    this.parcels = this.allSiuntos.filter((val) => val.sender.lastName.toLowerCase().includes(value));
    this.collectionSize = this.parcels.length;
  }

}
