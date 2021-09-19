import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Gavejas} from "./gavejas.service";

export class Siuntejas {
  constructor(
    public id: number,
    public siuntejoVardas: string,
    public siuntejoPavarde: string,
    public siuntejoAdresas: string
  ) {
  }
}

@Injectable({
  providedIn: 'root'
})
export class SiuntejasService {

  private baseUrl = 'http://localhost:8080/siuntos';

  constructor(private httpClient: HttpClient) { }

  gautiSiuntejus() {
    return this.httpClient.get<Gavejas[]>(`${this.baseUrl}/siuntejai`);
  }

  gautiSiunteja(id: number): Observable<any> {
    return this.httpClient.get(`${this.baseUrl}/siuntejai/${id}`);
  }

  public issaugotiSiunteja(siuntejas: Siuntejas) {
    return this.httpClient.post<Siuntejas>(`${this.baseUrl}/siuntejai/add`, siuntejas);
  }

  public redaguotiSiunteja(id: number, value: any): Observable<any> {
    return this.httpClient.put(`${this.baseUrl}/siuntejai/update/${id}`, value);
  }

  public istrintiSiunteja(siuntejas: Siuntejas) {
    return this.httpClient.delete<Siuntejas>(`${this.baseUrl}/siuntejai/${siuntejas.id}`);
  }
}
