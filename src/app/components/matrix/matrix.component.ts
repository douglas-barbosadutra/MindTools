import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import {Matrix} from 'src/app/models/Matrix';
import {MatrixService} from 'src/app/services/matrix.service';
import { Parametri } from 'src/app/models/Parametri';
import { NgModel } from '@angular/forms';
import { TransitiveCompileNgModuleMetadata } from '@angular/compiler';

@Component({
  selector: 'app-matrix',
  templateUrl: './matrix.component.html',
  styleUrls: ['./matrix.component.css']
})
export class MatrixComponent implements OnInit {

  private matrixList : Array<Matrix>;
  private matrix: Matrix;
  private parametro:Parametri;
  private principi:string;

  constructor(private matrixService: MatrixService, private router:  Router) { }

  ngOnInit() {

    this.matrixService.readMatrix().subscribe((data: any) =>{

      if(data != null){
        this.matrixList = data;
       
      }
    });

    
  }
   princ(event){
    
    var target = event.target;
    this.principi = target;
    
    
    console.log(target);
    
    
    



   }

  
}