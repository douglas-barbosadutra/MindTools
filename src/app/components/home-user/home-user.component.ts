import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-home-user',
  templateUrl: './home-user.component.html',
  styleUrls: ['./home-user.component.css']
})
export class HomeUserComponent implements OnInit {

  public pChiave: string;

  constructor(private router: Router) { }

  ngOnInit() {
    
  }

  cercaByParola(f: NgForm){
    //this.pChiave = response;
    sessionStorage.setItem("pChiave",JSON.stringify(f.value.pChiave));

    this.router.navigateByUrl('/PrincipiByParola'); 

  }
}
