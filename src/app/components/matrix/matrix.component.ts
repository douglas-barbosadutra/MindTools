import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import {Matrix} from 'src/app/models/Matrix';
import {MatrixService} from 'src/app/services/matrix.service';

@Component({
  selector: 'app-matrix',
  templateUrl: './matrix.component.html',
  styleUrls: ['./matrix.component.css']
})
export class MatrixComponent implements OnInit {

  private matrixList : Array<Matrix>;
  private matrix: Matrix;

  constructor(private matrixService: MatrixService, private router:  Router) { }

  ngOnInit() {

    this.matrixService.readMatrix().subscribe((data: any) =>{

      if(data != null){
        this.matrixList = data;
       
      }
    })
    
  }
  
}