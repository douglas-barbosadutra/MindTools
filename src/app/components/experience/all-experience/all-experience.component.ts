import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import {ExperienceService} from 'src/app/services/experience.service';
import { Experience } from 'src/app/models/Experience';
import { Router } from "@angular/router";
import { ExperienceUserFeedbackDTO } from 'src/app/models/ExperienceUserFeedbackDTO';
import { User } from 'src/app/models/User';
//import { Principi } from 'src/app/models/Principi';

@Component({
  selector: 'app-all-experience',
  templateUrl: './all-experience.component.html',
  styleUrls: ['./all-experience.component.css']
})

export class AllExperienceComponent implements OnInit {
  public experienceList : Array<ExperienceUserFeedbackDTO>;
  user: User;
  constructor(private experienceService: ExperienceService, private router:  Router) { }

  ngOnInit() {
    console.log(sessionStorage.getItem("user"));
    this.user = JSON.parse(sessionStorage.getItem("user"));
    console.log(this.user);

   this.experienceService.showAllExperiences(this.user.idUser).subscribe((response) =>{
      this.experienceList = response;
    });
  } }