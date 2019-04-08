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
  private parametri: Parametri;
  public nome: string;
  opcionSeleccionado1: string  = '0';
  opcionSeleccionado2: string  = '0';
  verSeleccion1: string = '';
  verSeleccion2: string = '';
  constructor(private parametriService: ParametriService, private router:  Router) { }
  
  onParamSelect1(){
    console.log(this.opcionSeleccionado1);
    this.verSeleccion1 = this.opcionSeleccionado1;
    
  }
  onParamSelect2(){
    this.verSeleccion2 = this.opcionSeleccionado2;
    
  }


  ngOnInit() {

    this.parametriService.readParametri().subscribe((data: any) =>{

      if(data != null){
        this.parametriList = data;
       
      }
    });
  }
    
    insertParametro(f: NgForm): void
    {
      console.log( f.value.parametriList.nome);
      
    }
    
  }
  
