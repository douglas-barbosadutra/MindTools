import { Component, OnInit } from '@angular/core';
import { Principi } from 'src/app/models/Principi';
import { PrincipiService } from 'src/app/services/principi/principi.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-principi-by-parola',
  templateUrl: './principi-by-parola.component.html',
  styleUrls: ['./principi-by-parola.component.css']
})
export class PrincipiByParolaComponent implements OnInit {


  public principi : Array<Principi>;
  

     constructor(private principiService:PrincipiService, private router: Router){

     }

     ngOnInit(){
       console.log(sessionStorage.getItem("pChiave"));
         this.principiService.cerca(sessionStorage.getItem("pChiave")).subscribe((response) => {
           console.log("principi: "+this.principi);
             this.principi = response;
         }) 
        }
selectLink(idPrincipi: number){
  sessionStorage.setItem("idPrincipi",JSON.stringify(idPrincipi));
  this.router.navigateByUrl('/PrincipiSelectOne');

}
}
