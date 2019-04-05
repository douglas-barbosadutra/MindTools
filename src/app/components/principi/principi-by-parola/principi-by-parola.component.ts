import { Component, OnInit } from '@angular/core';
import { Principi } from 'src/app/models/Principi';
import { PrincipiService } from 'src/app/services/principi/principi.service';
import { Router,ActivatedRoute } from '@angular/router';



@Component({
  selector: 'app-principi-by-parola',
  templateUrl: './principi-by-parola.component.html',
  styleUrls: ['./principi-by-parola.component.css']
})
export class PrincipiByParolaComponent implements OnInit {


  public principi : Array<Principi>;
  public pChiave : string;
  

     constructor(private principiService:PrincipiService, private route: ActivatedRoute, private router: Router){

     }

     ngOnInit(){
      this.pChiave = this.route.snapshot.params['pChiave'];  //.paramMap.get('pChiave');
      //alert("aa" + this.pChiave)
       this.principiService.cerca(this.pChiave).subscribe((response) => {
        
          this.principi = response;
      }) 
        }
selectLink(idPrincipi: number){
  sessionStorage.setItem("idPrincipi",JSON.stringify(idPrincipi));
  this.router.navigateByUrl('/PrincipiSelectOne');

}
}
