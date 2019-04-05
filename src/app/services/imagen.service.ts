import { Injectable } from '@angular/core';
import { HttpClient, HttpRequest, HttpEvent } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { Imagen } from 'src/app/models/Imagen';
import { tap, catchError } from 'rxjs/operators';
import { Form, NgForm } from '@angular/forms';
@Injectable({
  providedIn: 'root'
})
export class ImagenService {
  public selectedFile: File = null;

  constructor(private http: HttpClient) { }
  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(error);
      console.log('${operation} failed: ${error.message}');
      return of(result as T);
    };
  }

  pushFileToStorage(file: File) {
    let formdata: FormData = new FormData();
    formdata.append('file', file);
   // alert(formdata);
    return this.http.post('http://localhost:8080/Imagen/savefile', formdata);
  }

  insertImagen(file: NgForm) {
    return this.http.post('http://localhost:8080/Imagen/savefile?this.selectedFile=', file);
  }
  upload(file: FormData) {
    return this.http.post('http://localhost:8080/Imagen/upload', file);
  }




}
