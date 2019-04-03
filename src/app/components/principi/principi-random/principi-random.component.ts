import { Component, OnInit } from '@angular/core';
import { PrincipiService } from 'src/app/services/principi/principi.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-principi-random',
  templateUrl: './principi-random.component.html',
  styleUrls: ['./principi-random.component.css']
})
export class PrincipiRandomComponent implements OnInit {

  public idPrincipi: number;

  constructor(private principiService:PrincipiService, private router:Router) { }

  ngOnInit() {

  }

}
