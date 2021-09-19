import { Component, OnInit } from '@angular/core';
import {SiuntaService} from "../../services/siunta.service";
import {Siunta} from "../../services/siunta.service";

@Component({
  selector: 'app-siuntos-list',
  templateUrl: './siuntos-list.component.html',
  styleUrls: ['./siuntos-list.component.css']
})
export class SiuntosListComponent implements OnInit {

  siuntos!: Siunta[];
  isLoading = true;
  page = 1;
  pageSize = 5;
  collectionSize!: number;
  allSiuntos!: Siunta[];
  searchSiunta!: string;

  constructor(private siuntaService: SiuntaService) { }

  ngOnInit(): void {
    this.siuntaService.gautiSiuntas().subscribe((data: Siunta[]) => {
      this.collectionSize = data.length;
      this.siuntos = data;
      this.allSiuntos = this.siuntos;
    })
    this.isLoading = false;
  }

  search(value: string): void {
    this.siuntos = this.allSiuntos.filter((val) => val.siuntejas.siuntejoPavarde.toLowerCase().includes(value));
    this.collectionSize = this.siuntos.length;
  }

}
