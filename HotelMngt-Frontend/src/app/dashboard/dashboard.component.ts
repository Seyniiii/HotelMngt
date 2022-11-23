import { Component, OnInit } from '@angular/core';
import { Room } from '../room';
import { RoomService } from '../services/room.service';


@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  // room: Room[] = [];
  // editRoom={
  //   roomId:0,
  //   roomType:'',
  //   roomPhone:0,
  //   img:'',
  //   price:0
  // };
  constructor() { }

  ngOnInit(): void {
  //   this.getRooms();
  // }

  // onClickModal(room:Room){
  //   this.editRoom=room;
  // }
  // getRooms(){
  //   this.roomservice.getAll().subscribe((data: Room[])=>{
  //     this.room = data;
  //     console.log(this.room);
  //   })  
  // }

  // delete(roomId: number) {
  //   this.roomservice.delete(roomId).subscribe(res => {
  //     this.room = this.room.filter(item => item.roomId !== roomId);
  //     console.log('room deleted successfully!');
  //   })
  }

}
