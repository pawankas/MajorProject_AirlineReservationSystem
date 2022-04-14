import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.scss']
})
export class RegistrationComponent implements OnInit {
  dob:any;
  constructor(private _router: Router) { }

  ngOnInit(): void {
  }


  loginPage(){
    this._router.navigate(['/login']);
  }
}
