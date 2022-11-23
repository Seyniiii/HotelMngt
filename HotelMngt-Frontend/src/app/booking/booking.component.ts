import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Booking } from '../booking';
import { BookingService } from '../services/booking.service';

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {
  booking: Booking[] = [];

  editBooking = {
    bookingId: 0,
    startDate: new Date(),
    endDate: new Date(),
    numberOfOccupant: 0,
    amount: 0
  };

  constructor(private bookingService: BookingService, private route: Router) { }

  ngOnInit(): void {
    this.getBookings();
  }

  getBookings() {
    this.bookingService.getAll().subscribe((data: Booking[]) => {
      this.booking = data;
      console.log(this.booking);
    })
  }

  onUpdate(booking: Booking) {
    this.bookingService.update(booking).subscribe(data => {
      this.getBookings();
    })
  }

  delete(bookingId: number) {
    this.bookingService.delete(bookingId).subscribe(res => {
      this.booking = this.booking.filter(item => item.bookingId !== bookingId);
      console.log('Reservation deleted successfully!');
    })
  }

  onClickModal(booking: Booking) {
    this.editBooking = booking;
  }

  // goToEdit(id:number){
  //   this.route.navigate(['editbooking',id]);
  // }

}


