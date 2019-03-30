import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import {ExperienceService} from 'src/services/experience.service';
import { Experience } from 'src/models/Experience';
import { Router } from "@angular/router";

@Component({
  selector: 'app-all-experience',
  templateUrl: './all-experience.component.html',
  styleUrls: ['./all-experience.component.css']
})

export class AllExperienceComponent implements OnInit {
  private experienceList : Array<Experience>;
  private experience: Experience;
  constructor(private experienceService: ExperienceService, private router:  Router) { }

  ngOnInit() {
   this.experienceService.showAllExperiences().subscribe((data: any) =>{
      if(data != null){
        this.experienceList = data;
      }
    })
  }}