import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Room } from '../room';

@Injectable({
  providedIn: 'root'
})
export class RoomService {
  private baseUrl = "http://localhost:8080/room/" ;





  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }
   

  constructor(private httpclient:HttpClient) { }




  getAll(): Observable<any> {
  
    return this.httpclient.get(this.baseUrl)
  

  }

  find(roomId:number):Observable<Room>{
   return this.httpclient.get<Room>(`${this.baseUrl}`+roomId, this.httpOptions);

  }
  create(room:Room): Observable<any> {
    return this.httpclient.post(this.baseUrl, JSON.stringify(room), this.httpOptions)
  }
  update(room :Room): Observable<any> {
  
    return this.httpclient.put(this.baseUrl, JSON.stringify(room), this.httpOptions)
  }

  delete(id:number): Observable<Object> {
    return this.httpclient.delete(this.baseUrl + id, this.httpOptions)
  }



}
