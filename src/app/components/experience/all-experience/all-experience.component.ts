import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import {ExperienceService} from 'src/app/services/experience.service';
import { Experience } from 'src/app/models/Experience';
import { Router } from "@angular/router";
import { ExperienceUserFeedbackDTO } from 'src/app/models/ExperienceUserFeedbackDTO';
//import { Principi } from 'src/app/models/Principi';

@Component({
  selector: 'app-all-experience',
  templateUrl: './all-experience.component.html',
  styleUrls: ['./all-experience.component.css']
})

export class AllExperienceComponent implements OnInit {
  public experienceList : Array<ExperienceUserFeedbackDTO>;
  constructor(private experienceService: ExperienceService, private router:  Router) { }

  ngOnInit() {
    this.experienceService.showAllExperiences().subscribe((response) =>{

    })
  //  this.experienceService.showAllExperiences().subscribe((response) =>{
  //     alert("PROVA " + response);
  //       this.experienceList = response;
      
  //   })
  }}