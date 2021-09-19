import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

export class Sender {
  constructor(
    public id: number,
    public name: string,
    public lastName: string,
    public address: string
  ) {
  }
}

@Injectable({
  providedIn: 'root'
})
export class SenderService {

  private baseUrl = 'http://localhost:8080/parcels';

  constructor(private httpClient: HttpClient) { }

  getSenders() {
    return this.httpClient.get<Sender[]>(`${this.baseUrl}/senders`);
  }

  getSender(id: number): Observable<any> {
    return this.httpClient.get(`${this.baseUrl}/senders/${id}`);
  }

  public saveSender(sender: Sender) {
    return this.httpClient.post<Sender>(`${this.baseUrl}/addsender`, sender);
  }

  public updateSender(id: number, value: any): Observable<any> {
    return this.httpClient.put(`${this.baseUrl}/updatesender/${id}`, value);
  }

  public deleteSender(sender: Sender) {
    return this.httpClient.delete<Sender>(`${this.baseUrl}/senders/${sender.id}`);
  }
}
