import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.development';

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

  constructor(private http:HttpClient) { }

  login(credentials: Credentials):Observable<any> {
    let endpoint = '/users/login';
    console.log(credentials);
    return this.http.post(this.USER_SERVER+endpoint, credentials);
  }

  register() {

  }
}
