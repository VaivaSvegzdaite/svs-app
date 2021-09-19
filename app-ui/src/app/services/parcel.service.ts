import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Sender} from "./sender.service";
import {Receiver} from "./receiver.service";

export class Parcel {
  constructor(
    public id: number,
    public size: string,
    public weight: number,
    public sender: Sender,
    public receiver: Receiver
  ) {
  }
}

@Injectable({
  providedIn: 'root'
})
export class ParcelService {

  private baseUrl = 'http://localhost:8080';

  constructor(private httpClient: HttpClient) { }

  getParcels() {
    return this.httpClient.get<Parcel[]>(`${this.baseUrl}/parcels`);
  }

  getParcel(id: number): Observable<any> {
    return this.httpClient.get(`${this.baseUrl}/parcels/${id}`);
  }

  public saveParcel(parcel: Parcel) {
    return this.httpClient.post<Parcel>(`${this.baseUrl}/addparcel`, parcel);
  }

  public updateParcel(id: number, value: any): Observable<any> {
    return this.httpClient.put(`${this.baseUrl}/updateparcel/${id}`, value);
  }

  public deleteParcel(parcel: Parcel) {
    return this.httpClient.delete<Parcel>(`${this.baseUrl}/parcels/${parcel.id}`);
  }

}
