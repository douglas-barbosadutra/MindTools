import { Component, OnInit } from '@angular/core';
import { Principi } from 'src/app/models/Principi';
import { PrincipiService } from 'src/app/services/principi/principi.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-principi-read',
  templateUrl: './principi-read.component.html',
  styleUrls: ['./principi-read.component.css']
})
export class PrincipiReadComponent implements OnInit {


  public principi : Array<Principi>;
  

     constructor(private principiService:PrincipiService, private router: Router){

     }

     ngOnInit(){
       var a = localStorage.getItem("jwt");
         this.principiService.readPrincipi(a).subscribe((response) => {
            console.log(response)
             this.principi = response;
         }) 
        }
selectLink(idPrincipi: number){
  sessionStorage.setItem("idPrincipi",JSON.stringify(idPrincipi));
  this.router.navigateByUrl('/PrincipiSelectOne/'+ idPrincipi);

}
        
}
