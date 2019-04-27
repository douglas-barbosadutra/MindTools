import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { Principi } from 'src/app/models/Principi';
import { PrincipiService } from 'src/app/services/principi/principi.service';

@Component({
  selector: 'app-home-user',
  templateUrl: './home-user.component.html',
  styleUrls: ['./home-user.component.css']
})
export class HomeUserComponent implements OnInit {

  public principi : Array<Principi>;
  public principio : Principi;
  public pChiave: string;

  constructor(private principiService:PrincipiService, private router: Router) { }

  ngOnInit() {
    
  }

  getCookie(name) {
    var value = "; " + document.cookie;
    var parts = value.split("; " + name + "=");
    if (parts.length == 2)
        return parts.pop().split(";").shift();
}

  cercaByParola(f: NgForm){
   
    this.pChiave=f.value.pChiave;
    this.router.navigateByUrl('/PrincipiByParola/'+ this.pChiave)
    }
  
  
  }
  
