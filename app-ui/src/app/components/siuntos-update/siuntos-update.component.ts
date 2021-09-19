import { Component, OnInit } from '@angular/core';
import {Siunta, SiuntaService} from "../../services/siunta.service";
import {ActivatedRoute, Router} from "@angular/router";
import {Siuntejas} from "../../services/siuntejas.service";
import {Gavejas} from "../../services/gavejas.service";

@Component({
  selector: 'app-siuntos-update',
  templateUrl: './siuntos-update.component.html',
  styleUrls: ['./siuntos-update.component.css']
})
export class SiuntosUpdateComponent implements OnInit {
  id!: number;
  siunta!: Siunta;
  submitted = false;

  constructor(private siuntaService: SiuntaService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
    this.siunta = new Siunta(Number(''), '', Number(''),
      new Siuntejas(Number(''), '', '', ''),
      new Gavejas(Number(''), '', '', '', Number(''), ''));
    this.id = this.route.snapshot.params['id'];
    this.siuntaService.gautiSiunta(this.id).subscribe(data => {
      this.siunta = data;
    });
  }

  keistiSiunta() {
    this.siuntaService.redaguotiSiunta(this.id, this.siunta).subscribe();
    this.siunta = new Siunta(Number(''), '', Number(''),
      new Siuntejas(Number(''), '', '', ''),
      new Gavejas(Number(''), '', '', '', Number(''), ''));
    this.siuntosList();
  }

  onSubmit() {
    this.submitted = true;
    this.keistiSiunta();
  }

  siuntosList(){
    this.router.navigate(['/siuntos']).then();
  }

}
