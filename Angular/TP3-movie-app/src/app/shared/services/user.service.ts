import { HttpClient, HttpErrorResponse, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, catchError, map, tap } from 'rxjs';
import { environment } from 'src/environments/environment.development';
import { MessageService } from './message.service';

interface Credentials {
  email: string;
  password: string;
}

@Injectable({
  providedIn: 'root'
})
export class UserService {
  USER_SERVER = environment.USER_SERVER;
  login_token!: string ;

  constructor(
    private http:HttpClient,
    private messageService:MessageService) { }

  login(credentials: Credentials):Observable<any> {
    let endpoint = '/users/login';
    console.log(credentials);
    return this.http.post(this.USER_SERVER+endpoint, credentials)
    .pipe(
      tap( {
        error: (err:unknown) => {
          if(err instanceof HttpErrorResponse) {
            if(err.status==400) {
              console.log('dans tap', err);
              this.messageService.show('Erreur');
            }
          }
        }
      })
    );
  }

  register() {

  }
}


