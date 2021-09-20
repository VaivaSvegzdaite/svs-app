import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {Parcel, ParcelService} from "../../services/parcel.service";
import {Receiver} from "../../services/receiver.service";
import {Sender} from "../../services/sender.service";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-parcel-form',
  templateUrl: './parcel-form.component.html',
  styleUrls: ['./parcel-form.component.css']
})
export class ParcelFormComponent implements OnInit {

  parcel: Parcel = new Parcel(Number(''), '', '',
    new Sender(Number(''), '', '', ''),
    new Receiver(Number(''), '', '', '', '', ''));
  parcelSizeForm!: FormGroup;
  parcelSizes = ['S', 'M', 'L', 'XL']

  constructor(private parcelService: ParcelService, private router: Router, private fb: FormBuilder) {
  }

  ngOnInit() {
    this.parcelSizeForm = this.fb.group({
      parcelSizeControl: ['Select']
    });
  }

  createParcel(): void {
    this.parcelService.saveParcel(this.parcel)
      .subscribe(data => {
        alert("Siunta sėkmingai išsaugota!");
        this.router.navigate(['./parcels']).then();
      });
  };

}
