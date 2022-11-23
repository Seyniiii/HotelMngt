import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Booking } from '../booking';
import { BookingService } from '../services/booking.service';

@Component({
  selector: 'app-viewbooking',
  templateUrl: './viewbooking.component.html',
  styleUrls: ['./viewbooking.component.css']
})
export class ViewbookingComponent implements OnInit {
 bookingId!:number;
 booking!:Booking;

  constructor(public bookingService:BookingService,
    private route :ActivatedRoute,
    private router:Router
   ) { }

  ngOnInit(): void {
    this.bookingId=this.route.snapshot.params['bookingId'];

    this.bookingService.find(this.bookingId).subscribe((data:Booking)=>{
      this.booking=data;
    });
  }

}
