import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { Principi } from 'src/app/models/Principi';
import { tap, catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class PrincipiService {

  constructor(private http:HttpClient) { }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
        console.error(error);
        console.log('${operation} failed: ${error.message}');
        return of(result as T);
    };
}

readPrincipi():Observable <Array<Principi>> {
  return this.http.get<Array<Principi>>("http://localhost:8080/Principi/ShowAllPrincipi")
  
}

}
