import { ActivatedRoute, Router, ActivationEnd } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { Principi } from 'src/app/models/Principi';
import { PrincipiService } from 'src/app/services/principi/principi.service';
import {ParamDTO} from 'src/app/dto/ParamDTO';

@Component({
  selector: 'app-principi-select-one',
  templateUrl: './principi-select-one.component.html',
  styleUrls: ['./principi-select-one.component.css']
})
export class PrincipiSelectOneComponent implements OnInit {

  public idPrincipi: number;
  public principio : Principi;
  paramDTO: ParamDTO;

  constructor(private principiService:PrincipiService, private route: ActivatedRoute, private router: Router){ 
}

  ngOnInit() {

    this.idPrincipi=parseInt(sessionStorage.getItem("idPrincipi"));
    var a = localStorage.getItem("jwt");
    this.paramDTO = new ParamDTO(a, this.idPrincipi);
    this.principiService.selectPrincipio(this.idPrincipi).subscribe((response) => {
      this.principio = response;
      
  });
  }

}
