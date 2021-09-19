import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";
import {Parcel, ParcelService} from "../../services/parcel.service";
import {Receiver} from "../../services/receiver.service";
import {Sender} from "../../services/sender.service";
import {FormBuilder, FormGroup} from "@angular/forms";

@Component({
  selector: 'app-parcel-form',
  templateUrl: './parcel-form.component.html',
  styleUrls: ['./parcel-form.component.css']
})
export class ParcelFormComponent implements OnInit {

  parcel: Parcel = new Parcel(Number(''), '', Number(''),
    new Sender(Number(''), '', '', ''),
    new Receiver(Number(''), '', '', '', Number(''), ''));
  parcelSizeForm!: FormGroup;
  parcelSizes = ['S - siuntos dydis iki 0.5 kg',
    'M - siuntos dydis iki 2 kg',
    'L - siuntos dydis iki 9 kg',
    'XL - siuntos dydis nuo 10 kg']

  constructor(private parcelService: ParcelService, private router: Router, private fb: FormBuilder) {
  }

  ngOnInit() {
    this.parcelSizeForm = this.fb.group({
      countryControl: ['Select']
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
