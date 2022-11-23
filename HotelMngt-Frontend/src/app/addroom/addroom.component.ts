import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Room } from '../room';
import { RoomService } from '../services/room.service';

@Component({
  selector: 'app-addroom',
  templateUrl: './addroom.component.html',
  styleUrls: ['./addroom.component.css']
})
export class AddroomComponent implements OnInit {
room!: Room[];
form!:FormGroup
  constructor(public roomService : RoomService,
    private router:Router) { }

  ngOnInit(): void {
    this.form = new FormGroup({
     roomId: new FormControl('', [Validators.required]),
        roomType: new FormControl('', [Validators.required]),
       roomPhone: new FormControl('', [Validators.required]),
        img:new FormControl('', [Validators.required]),
       
  });
}
get f(){
  return this.form.controls;
}
submit(){
  console.log(this.form.value);
  this.roomService.create(this.form.value).subscribe((res:any) => {
       alert('room  created successfully!');
       this.router.navigateByUrl('/roomlist');
  })
}
}
