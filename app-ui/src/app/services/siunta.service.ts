import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Siuntejas} from "./siuntejas.service";
import {Gavejas} from "./gavejas.service";

export class Siunta {
  constructor(
    public id: number,
    public dydis: string,
    public svoris: number,
    public siuntejas: Siuntejas,
    public gavejas: Gavejas
  ) {
  }
}

@Injectable({
  providedIn: 'root'
})
export class SiuntaService {

  private baseUrl = 'http://localhost:8080';

  constructor(private httpClient: HttpClient) { }

  gautiSiuntas() {
    return this.httpClient.get<Siunta[]>(`${this.baseUrl}/siuntos`);
  }

  gautiSiunta(id: number): Observable<any> {
    return this.httpClient.get(`${this.baseUrl}/siuntos/${id}`);
  }

  public issaugotiSiunta(siunta: Siunta) {
    return this.httpClient.post<Siunta>(`${this.baseUrl}/addsiunta`, siunta);
  }

  public redaguotiSiunta(id: number, value: any): Observable<any> {
    return this.httpClient.put(`${this.baseUrl}/updatesiunta/${id}`, value);
  }

  public istrintiSiunta(siunta: Siunta) {
    return this.httpClient.delete<Siunta>(`${this.baseUrl}/siuntos/${siunta.id}`);
  }
}
