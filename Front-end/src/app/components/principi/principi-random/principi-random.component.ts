import { Component, OnInit } from '@angular/core';
import { PrincipiService } from 'src/app/services/principi/principi.service';
import { Router } from '@angular/router';
import { Principi } from 'src/app/models/Principi';

@Component({
  selector: 'app-principi-random',
  templateUrl: './principi-random.component.html',
  styleUrls: ['./principi-random.component.css']
})
export class PrincipiRandomComponent implements OnInit {

  public principio : Principi;
  
  

     constructor(private principiService:PrincipiService, private router: Router){

     }

     ngOnInit(){
         var a = localStorage.getItem("jwt");
         this.principiService.random(a).subscribe((response) => {
             this.principio = response;
         }) 
         
       
        }

}
