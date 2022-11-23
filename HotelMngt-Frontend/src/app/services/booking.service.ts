import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { Booking } from '../booking';


@Injectable({
  providedIn: 'root'
})
export class BookingService {

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }

  private url ="http://localhost:8080/booking/"

  constructor(private httpclient:HttpClient) { }


  getAll(): Observable<any> {
    return this.httpclient.get(this.url)
  }
  
  find(bookingId: number):Observable<Booking> {
   return this.httpclient.get<Booking>(`${this.url}`+ bookingId, this.httpOptions);
  }

  create(booking:Booking): Observable<any> {
    return this.httpclient.post(this.url, JSON.stringify(booking), this.httpOptions)
  }
  
  update(booking:Booking): Observable<any> {
    return this.httpclient.put(this.url, JSON.stringify(booking), this.httpOptions)
  }


  delete(id:number): Observable<Object> {
    return this.httpclient.delete(this.url  + id, this.httpOptions)
  }











}






