import { Injectable } from '@angular/core';
import { tap, catchError } from 'rxjs/operators';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Principi } from '../models/Principi';
import { Experience } from '../models/Experience';
import { Observable, of } from 'rxjs';
import { Feedback } from '../models/Feedback';
import { FeedbackPrincipiExperience } from '../models/FeedbackPrincipiExperience';

@Injectable({
  providedIn: 'root'
})
export class FeedbackService {
  constructor(private http: HttpClient) { }

  readFeedback(idExperience: number):Observable<Array<FeedbackPrincipiExperience>>{

        return this.http.get<Array<FeedbackPrincipiExperience>>("http://localhost:8080/Feedback/showFeedback?idExperience="+idExperience);
        
    }

  
}
