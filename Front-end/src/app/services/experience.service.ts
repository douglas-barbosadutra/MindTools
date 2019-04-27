import { Injectable } from '@angular/core';
import{ HttpClient, HttpParams } from '@angular/common/http';
import {Experience} from 'src/app/models/Experience';
import {Observable, of, BehaviorSubject} from 'rxjs';
import { ExperienceUserFeedbackDTO } from 'src/app/models/ExperienceUserFeedbackDTO';
import {Feedback} from 'src/app/models/Feedback';
import {User} from 'src/app/models/User';
import { ExperienceDTO } from '../dto/ExperienceDTO';
import {ParamDTO} from 'src/app/dto/ParamDTO';


@Injectable({
  providedIn: 'root'
})
export class ExperienceService {


  constructor(private http: HttpClient) { }
  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.log(result);
      console.error(error);
      console.log('${operation} failed: ${error.message}');
      return of(result as T);
    };
  }
  
  insertExperience(paramDTO: ParamDTO):Observable<any>{
    
    return this.http.post<any>("http://localhost:8094/Experience/insert",paramDTO);
    
  }
  showAllExperiences(token:string):Observable<Array<ExperienceUserFeedbackDTO>>{
    return this.http.get<Array<ExperienceUserFeedbackDTO>> ("http://localhost:8094/Experience/showAllExperience?jwt="+token);
  }

}