import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {Siunta, SiuntaService} from "../../services/siunta.service";

@Component({
  selector: 'app-siuntos-details',
  templateUrl: './siuntos-details.component.html',
  styleUrls: ['./siuntos-details.component.css']
})
export class SiuntosDetailsComponent implements OnInit {
  id!: number;
  siunta!: Siunta;
  siuntos: Siunta[] = [];

  constructor(private siuntaService: SiuntaService, private activatedRoute: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.siunta = new Siunta(Number(''), '', Number(''), Object(''), Object(''));
    this.id = this.activatedRoute.snapshot.params['id'];
    this.siuntaService.gautiSiunta(this.id)
      .subscribe(data => {
        this.siunta = data;
      },);
  }

  trintiSiunta(siunta: Siunta): void {
    this.siuntaService.istrintiSiunta(siunta)
      .subscribe(data => {
        this.siuntos = this.siuntos.filter(s => s !== siunta);
        this.router.navigate(['./siuntos']).then();
        alert("Siunta ištrinta sėkmingai!");
      })
  };

}
