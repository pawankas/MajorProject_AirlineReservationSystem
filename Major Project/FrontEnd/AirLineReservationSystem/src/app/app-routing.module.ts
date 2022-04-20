import { FlightsComponent } from './FlightComponents/flights/flights.component';

import { RegisterComponent } from './myComponents/register/register.component';
import { LoginComponent } from './myComponents/Login/Login.component';

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponentComponent } from './myComponents/home-component/home-component.component';


const routes: Routes = [
  { path: 'home', component: HomeComponentComponent },
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'flights', component: FlightsComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
