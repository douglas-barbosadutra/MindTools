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
  public pChiave: string;

  constructor(private principiService:PrincipiService, private router: Router) { }

  ngOnInit() {
    
  }

  cercaByParola(f: NgForm){
  
    this.pChiave=f.value.pChiave;
    this.router.navigateByUrl('/PrincipiByParola/'+ this.pChiave)
    }
  
  
  }
  
