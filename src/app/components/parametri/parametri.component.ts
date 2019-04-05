import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import {Parametri} from 'src/app/models/Parametri';
import {ParametriService} from 'src/app/services/parametri.service';

@Component({
  selector: 'app-parametri',
  templateUrl: './parametri.component.html',
  styleUrls: ['./parametri.component.css']
})
export class ParametriComponent implements OnInit {

  private parametriList : Array<Parametri>;
  private parametri: Parametri;

  constructor(private parametriService: ParametriService, private router:  Router) { }

  ngOnInit() {

    this.parametriService.readParametri().subscribe((data: any) =>{

      if(data != null){
        this.parametriList = data;
       
      }
    })
    
  }
  
}