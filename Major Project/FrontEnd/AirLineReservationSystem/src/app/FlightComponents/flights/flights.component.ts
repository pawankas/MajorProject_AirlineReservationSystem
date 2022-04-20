import { Flight } from './../../utitlities/flight';


import { FlightService } from './../../service/flight.service';
import { Component, OnInit } from '@angular/core';

import { Observable,Subject } from "rxjs";
import {FormControl,FormGroup,Validators} from '@angular/forms';

import { Router } from '@angular/router';



@Component({
  selector: 'app-flights',
  templateUrl: './flights.component.html',
  styleUrls: ['./flights.component.scss']
})
export class FlightsComponent implements OnInit {

  constructor(private flightService:FlightService,
    private router: Router) { }

  flights: Flight[] = [];


  ngOnInit(): void {
    this.getFlights();
  }

  private getFlights(){
    this.flightService.getFlightList().subscribe(data => {
      this.flights = data;
    });
  }


}
