import { HttpClientModule } from '@angular/common/http';
import { FlightsComponent } from './FlightComponents/flights/flights.component';


import { RegisterComponent } from './myComponents/register/register.component';
import { LoginComponent } from './myComponents/Login/Login.component';
import { FooterComponent } from './myComponents/footer/footer.component';
import { NavbarComponent } from './myComponents/navbar/navbar.component';
import { RouterModule } from '@angular/router';
import { HomeComponentComponent } from './myComponents/home-component/home-component.component';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponentComponent,
    NavbarComponent,
    FooterComponent,
    LoginComponent,
    RegisterComponent,
    FlightsComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,


  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
