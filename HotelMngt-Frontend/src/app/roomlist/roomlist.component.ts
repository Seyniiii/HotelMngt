import { Component, OnInit } from '@angular/core';
import { Room } from '../room';
import { RoomService } from '../services/room.service';

@Component({
  selector: 'app-roomlist',
  templateUrl: './roomlist.component.html',
  styleUrls: ['./roomlist.component.css']
})
export class RoomlistComponent implements OnInit {
 room:Room[]=[
//   {
//     roomId:1,
//     roomPhone:4478996,
//     roomType:"Suite",
//     img:"assets/suite.jpg",
// price:65412
//   } ,{
//     roomId:2,
//     roomPhone:2500,
//     roomType:"Double",
//     img:"assets/double.jpg",
//     price:65555

//   } ,{
//     roomId:3,
//     roomPhone:40000,
//     roomType:"Presidential",
//     img:"assets/presi.jpg"
// ,
// price:23639
//   },{
//     roomId:3,
//     roomPhone:2500,
//     roomType:"Family",
//     img:"assets/solo.jpg",
//     price:12365
//   }
]



searchText:any;


constructor(private roomservice:RoomService ) { }

  ngOnInit(): void {
   
    
  }

  public getAll():Room[]{
    return  this.room;
  }
  

}
