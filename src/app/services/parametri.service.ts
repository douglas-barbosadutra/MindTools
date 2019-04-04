import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import {Parametri} from 'src/app/models/Parametri';
import { tap, catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ParametriService {

  constructor(private http:HttpClient) { }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
        console.error(error);
        console.log('${operation} failed: ${error.message}');
        return of(result as T);
    };
  }

  readParametri():Observable <Array<Parametri>> {
    return this.http.get<Array<Parametri>>("http://localhost:8080/Parametri/param")
    
  }
  
}
