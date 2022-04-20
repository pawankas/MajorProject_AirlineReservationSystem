import { Component, OnInit } from '@angular/core';
import { Location, LocationStrategy, PathLocationStrategy } from '@angular/common';

@Component({
  selector: 'app-Login',
  templateUrl: './Login.component.html',
  styleUrls: ['./Login.component.css']
})
export class LoginComponent implements OnInit {

  location: Location;
  constructor(location: Location) {
    this.location = location;
  }
  ngOnInit() {
  }


  goBack() {
    this.location.back();
  }
}
