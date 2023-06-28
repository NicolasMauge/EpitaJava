import { Component } from '@angular/core';
import { MovieService } from '../shared/services/movie.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UserService } from '../shared/services/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  loginForm!: FormGroup;
  isSubmitted:boolean = false;

  constructor(
          private userService:UserService, 
          private fb:FormBuilder) {}

  ngOnInit() {
    this.loginForm = this.fb.group({
      email: ['', Validators.email],
      password: ['', [Validators.required, Validators.minLength(3)]]
    })
  }

  onSubmitForm(event: Event) {
    event.preventDefault();
    this.isSubmitted = true;
    //console.log(this.loginForm.controls);

    if(this.loginForm.valid) {
      //let login_params = {email:this.loginForm.controls['email'].value, password:this.loginForm.controls['password'].value};
      this.userService.login(this.loginForm.value)
        .subscribe({
          next: (response) => {localStorage.setItem('token', response.token);},
          error: (error) => {console.log(error)},
          complete: () => {console.log('complete')}
        });
          
          /*
          (response:any) => {
        console.log(response.error);
        //console.log(response.status);
        localStorage.setItem('token', response.token);
      });*/
    }
  }

}
