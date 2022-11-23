import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Booking } from '../booking';
import { BookingService } from '../services/booking.service';

@Component({
  selector: 'app-addbooking',
  templateUrl: './addbooking.component.html',
  styleUrls: ['./addbooking.component.css']
})
export class AddbookingComponent implements OnInit {
  form!: FormGroup;
  booking!: Booking []
  constructor(public bookingService:BookingService,
    private router :Router,) { }

 
    ngOnInit(): void {
      this.form = new FormGroup({
     bookingId: new FormControl('', [Validators.required]),
       startDate: new FormControl('', [Validators.required]),
       endDate: new FormControl('', [Validators.required]),
       numberOfOccupant:new FormControl('', [Validators.required]),
       amount: new FormControl('', [Validators.required]),
      
      });
    }


    get f(){
      return this.form.controls;
    }
    submit(){
      console.log(this.form.value);
      this.bookingService.create(this.form.value).subscribe((res:any) => {
           alert('booking  created successfully!');
           this.router.navigateByUrl('/booking');
      })
    }

  }


