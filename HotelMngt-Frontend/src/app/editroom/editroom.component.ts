import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Room } from '../room';
import { RoomService } from '../services/room.service';


@Component({
  selector: 'app-editroom',
  templateUrl: './editroom.component.html',
  styleUrls: ['./editroom.component.css']
})
export class EditroomComponent implements OnInit {
room!: Room;
roomId!:number;
form!:FormGroup
  constructor(public roomService :RoomService,
    private router:Router ,
    private route:ActivatedRoute
    ) { }

  ngOnInit(): void {

    this.roomId=this.route.snapshot.params['roomId'];
    this.roomService.find(this.roomId).subscribe((response)=>{
    this.room = response;
    });


    this.form = new FormGroup({
      roomId: new FormControl('', [Validators.required]),
      rooomType: new FormControl('', [Validators.required]),
      roomPhone: new FormControl('', [Validators.required]),
      img: new FormControl('', [Validators.required]),
     
     });
  }
get f (){
  return this.form.controls;
}

submit(){
  console.log(this.form.value);
  this.roomService.update(this.form.value).subscribe((res:any) => {
       alert('room  edited successfully!');
       this.router.navigateByUrl('/room');
  })
}

}
