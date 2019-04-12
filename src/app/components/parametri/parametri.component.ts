import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import {Parametri} from 'src/app/models/Parametri';
import {ParametriService} from 'src/app/services/parametri.service';
import { NgForm } from '@angular/forms';
import { AngularDualListBoxModule } from 'angular-dual-listbox'; 
import { Key } from 'protractor';
import {Queue} from 'queue-typescript';
import { of } from 'rxjs';


@Component({
  selector: 'app-parametri',
  templateUrl: './parametri.component.html',
  styleUrls: ['./parametri.component.css']
})
export class ParametriComponent implements OnInit {

  private parametriList : Array<Parametri>;
  private parametriSceltiList : Array<Parametri>;
  private parametri: Parametri;
  private parametriSelezionati : Queue<Parametri>;
  
  
  constructor(private parametriService: ParametriService, private router:  Router) { }
  
  

  ngOnInit() {

    this.parametriService.readParametri().subscribe((data: any) =>{

      if(data != null){
        this.parametriList = data;
       
      }
    });

    let numbers: Parametri[] = [];
    this.parametriSelezionati = new Queue<Parametri>(... numbers);
  }

   public choose(id: String) : void 
  {
    
    console.log(id);
    if(this.parametriSelezionati.length == 2){
      this.parametriSelezionati.removeHead();
    }
    
    for(let parametri of this.parametriList)
    {
      
      if(parametri.id == 1)
      this.parametriSelezionati.append(parametri);
    }
    
    console.log(this.parametriSelezionati);

    
    

  }



  


  }
    
    
  
  
