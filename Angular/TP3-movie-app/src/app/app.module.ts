import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MovieListComponent } from './movie-list/movie-list.component';
import { SearchbarComponent } from './searchbar/searchbar.component';
import { ActionbarComponent } from './actionbar/actionbar.component';
import { HTTP_INTERCEPTORS, HttpClientModule } from '@angular/common/http';
import { PrintImgPipe } from './shared/pipes/print-img.pipe';
import { StarsComponent } from './shared/components/stars/stars.component';
import { MovieDetailComponent } from './movie-detail/movie-detail.component';
import { PrintDurationPipe } from './shared/pipes/print-duration.pipe';
import { LoginComponent } from './login/login.component';
import { ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatSnackBarModule} from '@angular/material/snack-bar';
import { CommentFormComponent } from './comment-form/comment-form.component'; 
import { TokenInterceptor } from './shared/token.interceptor';

@NgModule({
  declarations: [
    AppComponent,
    MovieListComponent,
    SearchbarComponent,
    ActionbarComponent,
    PrintImgPipe,
    StarsComponent,
    MovieDetailComponent,
    PrintDurationPipe,
    LoginComponent,
    CommentFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    MatSnackBarModule
  ],
  providers: [{provide: HTTP_INTERCEPTORS, useClass:TokenInterceptor, multi:true}],
  bootstrap: [AppComponent]
})
export class AppModule { }
