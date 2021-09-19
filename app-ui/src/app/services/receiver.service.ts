import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

export class Receiver {
  constructor(
    public id: number,
    public name: string,
    public lastName: string,
    public address: string,
    public phone: number,
    public email: string
  ) {
  }
}

@Injectable({
  providedIn: 'root'
})
export class ReceiverService {

  private baseUrl = 'http://localhost:8080/parcels';

  constructor(private httpClient: HttpClient) { }

  getReceivers() {
    return this.httpClient.get<Receiver[]>(`${this.baseUrl}/receivers`);
  }

  getReceiver(id: number): Observable<any> {
    return this.httpClient.get(`${this.baseUrl}/receivers/${id}`);
  }

  public saveReceiver(receiver: Receiver) {
    return this.httpClient.post<Receiver>(`${this.baseUrl}/addreceiver`, receiver);
  }

  public updateReceiver(id: number, value: any): Observable<any> {
    return this.httpClient.put(`${this.baseUrl}/updatereceiver/${id}`, value);
  }

  public deleteReceiver(receiver: Receiver) {
    return this.httpClient.delete<Receiver>(`${this.baseUrl}/receivers/${receiver.id}`);
  }
}
