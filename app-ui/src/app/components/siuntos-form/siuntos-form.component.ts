import { Component, OnInit } from '@angular/core';
import {Siunta, SiuntaService} from "../../services/siunta.service";
import {Router} from "@angular/router";
import {Siuntejas} from "../../services/siuntejas.service";
import {Gavejas} from "../../services/gavejas.service";

@Component({
  selector: 'app-siuntos-form',
  templateUrl: './siuntos-form.component.html',
  styleUrls: ['./siuntos-form.component.css']
})
export class SiuntosFormComponent implements OnInit {

  siunta: Siunta =  new Siunta(Number(''), '', Number(''),
    new Siuntejas(Number(''), '', '', ''),
    new Gavejas(Number(''), '', '', '', Number(''), ''));

  constructor(private siuntaService: SiuntaService, private router: Router) { }

  ngOnInit() {
  }

  sukurtiSiunta(): void {
    this.siuntaService.issaugotiSiunta(this.siunta)
      .subscribe(data => {
        alert("Siunta sėkmingai išsaugota!");
        this.router.navigate(['./siuntos']).then();
      });
  };

}
