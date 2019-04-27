import { Component, OnInit } from '@angular/core';
import { Principi } from 'src/app/models/Principi';
import { PrincipiService } from 'src/app/services/principi/principi.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-contradiction',
  templateUrl: './contradiction.component.html',
  styleUrls: ['./contradiction.component.css']
})
export class ContradictionComponent implements OnInit {

  
  public principi : Array<Principi>;
  constructor(private principiService:PrincipiService, private router: Router) { }

  ngOnInit() {
    var a = ""
    this.principiService.readPrincipi(a).subscribe((response) => {
     // this.principi = response;
  }) 
  }

  selectLink(idPrincipi: number){
    sessionStorage.setItem("idPrincipi",JSON.stringify(idPrincipi));
    this.router.navigateByUrl('/PrincipiSelectOne');
  
  }

}
