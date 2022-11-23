import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { BookingComponent } from './booking/booking.component';
import { RoomComponent } from './room/room.component';
import { UserComponent } from './user/user.component';
// import { WardenComponent } from './warden/warden.component';
import { EmployeeComponent } from './employee/employee.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RoomlistComponent } from './roomlist/roomlist.component';
import { AddbookingComponent } from './addbooking/addbooking.component';
import { EditbookingComponent } from './editbooking/editbooking.component';
import { BookinglistComponent } from './bookinglist/bookinglist.component';
import { RoomdetailsComponent } from './roomdetails/roomdetails.component';
import { AddroomComponent } from './addroom/addroom.component';
import { EditroomComponent } from './editroom/editroom.component';
import { ViewbookingComponent } from './viewbooking/viewbooking.component';
import { ViewroomComponent } from './viewroom/viewroom.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ListroomComponent } from './lists/listroom/listroom.component';
import { Ng2SearchPipeModule } from 'ng2-search-filter';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AdminComponent,
    BookingComponent,
    RoomComponent,
    UserComponent,
   // WardenComponent,
    EmployeeComponent,
    HomeComponent,
    NavbarComponent,
    RoomlistComponent,
    AddbookingComponent,
    EditbookingComponent,
    BookinglistComponent,
    RoomdetailsComponent,
    AddroomComponent,
    EditroomComponent,
    ViewbookingComponent,
    ViewroomComponent,
    DashboardComponent,
    ListroomComponent,
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    Ng2SearchPipeModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
