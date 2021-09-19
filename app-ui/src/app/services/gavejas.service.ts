import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Siunta} from "./siunta.service";

export class Gavejas {
  constructor(
    public id: number,
    public gavejoVardas: string,
    public gavejoPavarde: string,
    public gavejoAdresas: string,
    public gavejoTelefonas: number,
    public gavejoElPastas: string
  ) {
  }
}

@Injectable({
  providedIn: 'root'
})
export class GavejasService {

  private baseUrl = 'http://localhost:8080/siuntos';

  constructor(private httpClient: HttpClient) { }

  gautiGavejus() {
    return this.httpClient.get<Gavejas[]>(`${this.baseUrl}/gavejai`);
  }

  gautiGaveja(id: number): Observable<any> {
    return this.httpClient.get(`${this.baseUrl}/gavejai/${id}`);
  }

  public issaugotiGaveja(gavejas: Gavejas) {
    return this.httpClient.post<Gavejas>(`${this.baseUrl}/gavejai/add`, gavejas);
  }

  public redaguotiGaveja(id: number, value: any): Observable<any> {
    return this.httpClient.put(`${this.baseUrl}/gavejai/update/${id}`, value);
  }

  public istrintiGaveja(gavejas: Gavejas) {
    return this.httpClient.delete<Gavejas>(`${this.baseUrl}/gavejai/${gavejas.id}`);
  }

}
