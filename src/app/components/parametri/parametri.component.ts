import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import {Parametri} from 'src/app/models/Parametri';
import {ParametriService} from 'src/app/services/parametri.service';
import { NgForm } from '@angular/forms';



@Component({
  selector: 'app-parametri',
  templateUrl: './parametri.component.html',
  styleUrls: ['./parametri.component.css']
})
export class ParametriComponent implements OnInit {

  private parametriList : Array<Parametri>;
  private parametriSceltiList : Array<Parametri>;
  private parametri: Parametri;
  public nome: string;
  
  constructor(private parametriService: ParametriService, private router:  Router) { }
  
  

  ngOnInit() {

    this.parametriService.readParametri().subscribe((data: any) =>{

      if(data != null){
        this.parametriList = data;
       
      }
    });
  }


    
    
    
  }
  
