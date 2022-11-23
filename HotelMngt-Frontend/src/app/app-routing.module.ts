import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddbookingComponent } from './addbooking/addbooking.component';
import { AddroomComponent } from './addroom/addroom.component';
import { AdminComponent } from './admin/admin.component';
import { BookingComponent } from './booking/booking.component';
import { BookinglistComponent } from './bookinglist/bookinglist.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { EditbookingComponent } from './editbooking/editbooking.component';
import { EmployeeComponent } from './employee/employee.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { NavbarComponent } from './navbar/navbar.component';

import { RoomComponent } from './room/room.component';
import { RoomlistComponent } from './roomlist/roomlist.component';
import { UserComponent } from './user/user.component';
import { ViewbookingComponent } from './viewbooking/viewbooking.component';
import { ViewroomComponent } from './viewroom/viewroom.component';

const routes: Routes = [
  {path:'admin', component: AdminComponent},
  {path:'booking', component: BookingComponent},
  {path:'employeee', component: EmployeeComponent},
  {path:'room', component: RoomComponent},
  {path:'user', component: UserComponent},
  {path:'home', component: HomeComponent},
  {path:'login', component: LoginComponent},
  {path:'navbar', component: NavbarComponent},
  {path:'roomlist', component: RoomlistComponent},
  {path:'addbooking',component:AddbookingComponent},
  {path:'editbooking/:bookingId',component:EditbookingComponent},
  {path:'viewbooking/:bookingId',component:ViewbookingComponent},
  {path:'addroom',component:AddroomComponent},
  {path:'bookinglist',component:BookinglistComponent},
  {path:'editroom/:roomId',component:EditbookingComponent},
  {path:'viewroom/:roomId',component:ViewroomComponent},
  {path:'dashboard',component:DashboardComponent},

  
  {path:'', redirectTo:'home', pathMatch:'full'},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
