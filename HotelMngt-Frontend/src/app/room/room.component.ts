import { Component, OnInit } from '@angular/core';
import { Room } from '../room';

import { RoomService } from '../services/room.service';


@Component({
  selector: 'app-room',
  templateUrl: './room.component.html',
  styleUrls: ['./room.component.css']
})
export class RoomComponent implements OnInit {

 room: Room[] = [];
 
searchText: any;

editRoom={
  roomId:0,
  roomType:'',
  roomPhone:0,
  img:'',
  price:0
};


  constructor(private roomService:RoomService) { }

  ngOnInit(): void {
    this.getRooms()
  }

  //
    getRooms(){
    this.roomService.getAll().subscribe((data: Room[])=>{
      this.room = data;
      console.log(this.room);
    })  
  }
  //
  onUpdate(room:Room){
    this.roomService.update(room).subscribe(data=>{
      this.getRooms();
    })
  }
onClickModal(room:Room){
  this.editRoom=room;
}

delete(roomId: number) {
  this.roomService.delete(roomId).subscribe(res => {
    this.room = this.room.filter(item => item.roomId !== roomId);
    console.log('room deleted successfully!');
  })
}



}
