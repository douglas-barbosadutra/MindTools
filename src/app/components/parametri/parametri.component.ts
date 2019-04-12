import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import {Parametri} from 'src/app/models/Parametri';
import {ParametriService} from 'src/app/services/parametri.service';
import { NgForm } from '@angular/forms';
import { AngularDualListBoxModule } from 'angular-dual-listbox'; 
import { Key } from 'protractor';
import {Queue} from 'queue-typescript';
import { of } from 'rxjs';
import { ProvaComponent } from '../prova/prova.component';


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
  private merge: String;
  
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

   public choose(parametri: Parametri) : void 
  {
    
    //console.log(parametri);
    if(this.parametriSelezionati.length == 2){
      this.parametriSelezionati.removeHead();
    }
    
    //for(let parametri of this.parametriList)
    //{
      
      //if(parametri.id == parseInt(id))
      this.parametriSelezionati.append(parametri);
    //}
    
    //console.log(this.parametriSelezionati);
    
   
     
     
     this.parametriService.inviaParametriSelezionati(this.parametriSelezionati.toArray());

     
     
    
    
   
    

    
    

  }



  


  }
    
    
  
  
