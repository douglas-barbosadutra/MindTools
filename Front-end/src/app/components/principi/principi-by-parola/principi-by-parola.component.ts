import { Component, OnInit } from '@angular/core';
import { Principi } from 'src/app/models/Principi';
import { PrincipiService } from 'src/app/services/principi/principi.service';
import { Router,ActivatedRoute } from '@angular/router';
import {ParamDTO} from 'src/app/dto/ParamDTO'



@Component({
  selector: 'app-principi-by-parola',
  templateUrl: './principi-by-parola.component.html',
  styleUrls: ['./principi-by-parola.component.css']
})
export class PrincipiByParolaComponent implements OnInit {


  public principi : Array<Principi>;
  public pChiave : string;
  paramDTO:ParamDTO;


     constructor(private principiService:PrincipiService, private route: ActivatedRoute, private router: Router){

     }

     ngOnInit(){
      this.pChiave = this.route.snapshot.params['pChiave'];  //.paramMap.get('pChiave');
      var a = localStorage.getItem("jwt");
      this.paramDTO = new ParamDTO(a,this.pChiave);
       this.principiService.cerca(this.pChiave).subscribe((response) => {
        
          this.principi = response;
      }) 
        }
selectLink(idPrincipi: number){
  sessionStorage.setItem("idPrincipi",JSON.stringify(idPrincipi));
  this.router.navigateByUrl('/PrincipiSelectOne');

}
}
