import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Booking } from '../booking';
import { BookingService } from '../services/booking.service';



@Component({
  selector: 'app-editbooking',
  templateUrl: './editbooking.component.html',
  styleUrls: ['./editbooking.component.css']
})
export class EditbookingComponent implements OnInit {
bookingId!:number;
booking!:Booking;
form!:FormGroup;
  constructor(public bookingService:BookingService,
    private route: ActivatedRoute,
    private router:Router
     ) { }

  ngOnInit(): void {

    this.bookingId = this.route.snapshot.params['bookingId'];
    this.bookingService.find(this.bookingId).subscribe((response)=> {
      this.booking = response;
    }); 
      
    this.form = new FormGroup({
      bookingId: new FormControl('', [Validators.required]),
      startDate: new FormControl('', [Validators.required]),
      endDate: new FormControl('', [Validators.required]),
      numberOfOccupant: new FormControl('', [Validators.required]),
      amount:new FormControl('', [Validators.required]),
      
     });

     }
  
  get f(){
    return this.form.controls;
  }


  submit(){
    console.log(this.form.value);
    this.bookingService.update(this.form.value).subscribe((res:any) => {
         alert('booking  edited successfully!');
         this.router.navigateByUrl('/booking');
    })
  }

}
