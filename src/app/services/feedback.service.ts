import { Injectable } from '@angular/core';
import { tap, catchError } from 'rxjs/operators';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Principi } from '../models/Principi';
import { Experience } from '../models/Experience';
import { Observable, of } from 'rxjs';
import { Feedback } from '../models/Feedback';

@Injectable({
  providedIn: 'root'
})
export class FeedbackService {
  constructor(private http: HttpClient) { }

  readFeedback():Observable<Array<Feedback>>{

        return this.http.get<Array<Feedback>>("http://localhost:8080/Feedback/showFeedback");
        
    }

  
}
