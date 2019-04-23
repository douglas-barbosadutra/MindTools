import { Component, OnInit } from '@angular/core';
import { FeedbackService } from "src/app/services/feedback.service";
import { Feedback } from "src/app/models/Feedback";
import { Router } from "@angular/router";
import { PrincipiService } from "src/app/services/principi/principi.service";

import { NgForm } from "@angular/forms";
import { FeedbackPrincipiExperience } from 'src/app/models/FeedbackPrincipiExperience';
import { Principi } from 'src/app/models/Principi';

@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css']
})
export class FeedbackComponent implements OnInit {
  public feedback : FeedbackPrincipiExperience;
  public idExperience : number;
  public secondari: Array<Principi>
  constructor(private feedbackService:FeedbackService, private router: Router) { 

  }

     ngOnInit(){
      this.idExperience= parseInt(sessionStorage.getItem("idExperience"));

      alert(this.idExperience);

         this.feedbackService.readFeedback(this.idExperience).subscribe((data: any) =>{
          if(data != null){
            this.secondari = data;
            
            console.log(this.secondari);
          }
        });

      }}