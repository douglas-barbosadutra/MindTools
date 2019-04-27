import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import {Parametri} from 'src/app/models/Parametri';
import {ParametriService} from 'src/app/services/parametri.service';
import { NgForm } from '@angular/forms';
import { AngularDualListBoxModule } from 'angular-dual-listbox'; 
import { Key } from 'protractor';
import {Queue} from 'queue-typescript';
import { of } from 'rxjs';

import { Principi } from 'src/app/models/Principi';
import { error } from 'util';


@Component({
  selector: 'app-parametri',
  templateUrl: './parametri.component.html',
  styleUrls: ['./parametri.component.css']
})
export class ParametriComponent implements OnInit {

  private parametriList : Array<Parametri>;
  public parametriSceltiList : Array<Parametri> = new Array<Parametri>();
  private parametri: Parametri;
  private parametriSelezionati : Queue<Parametri>;
  private merge: String;
  public principi : Array<Principi>;
  
  
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
      this.parametriSelezionati.append(parametri);
      console.log(this.parametriSelezionati.head);
      
     
      
    //}
    
    console.log(JSON.stringify(this.parametriSelezionati.toArray()));
   // var a = this.parametriSelezionati.
     
  }

  mostrar(){
    var l = this.parametriSceltiList.push(new Parametri(this.parametriSelezionati.head.id, this.parametriSelezionati.head.nome));
    var o = this.parametriSceltiList.push(new Parametri(this.parametriSelezionati.tail.id, this.parametriSelezionati.tail.nome));
    console.log(this.parametriSceltiList);
    alert(this.parametriSceltiList);

    this.parametriService.inviaParametriSelezionati(this.parametriSelezionati.toArray()).subscribe((response) => {
      if (response != null){
        this.principi = response;
      }
      alert("Consulte la matrix");
    
  });
  }



  


  }
    
    
  
  
