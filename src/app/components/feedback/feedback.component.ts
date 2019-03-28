import { Component, OnInit } from '@angular/core';
import { FeedbackService } from "src/app/services/feedback.service";
import { Feedback } from "src/app/models/Feedback";
import { Router } from "@angular/router";

import { NgForm } from "@angular/forms";

@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css']
})
export class FeedbackComponent implements OnInit {
  public feedback : Array<Feedback>

  constructor(private feedbackService:FeedbackService, private router: Router) { 

  }

     ngOnInit(){

         this.feedbackService.readFeedback().subscribe((response) => {

             this.feedback = response;

         })
        } 
      }
