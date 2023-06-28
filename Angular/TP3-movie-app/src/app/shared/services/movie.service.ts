import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { BehaviorSubject, Observable, map, tap } from 'rxjs';
import { Movie } from '../model/movie';
import { mapToCanActivate } from '@angular/router';
import { ThisReceiver } from '@angular/compiler';
import { environment } from 'src/environments/environment.development';

@Injectable({
  providedIn: 'root'
})
export class MovieService {
  TMDB_API = 'https://api.themoviedb.org/3';
  TMDB_APIKEY = environment.APIKEY_TMDB;

  private _movies$ = new BehaviorSubject<Movie[]>([]);

  constructor(private http:HttpClient) {
    //console.log(this);
  }

  getMoviesFromApi():void {
    let endpoint = '/discover/movie';
    let options = new HttpParams()
      .append('api_key', this.TMDB_APIKEY)
      .append('language', 'fr')
      .append('page', 1);
    //return this.http.get('https://api.themoviedb.org/3/discover/movie?api_key=2e778ca4742d3e8e5f1ee2d5018255fc&language=fr');
    //return this.http.get(this.TMDB_API+endpoint+'?api_key=2e778ca4742d3e8e5f1ee2d5018255fc&language=fr')
    this.http.get(this.TMDB_API+endpoint, {params:options})
      .pipe(map(
        (response: any) => response.results.map(
            (movie:any) => new Movie(movie))
          )
      )
      .subscribe(data => this._movies$.next(data));
  }

  searchMovie(userInput: string): Observable<Movie[]> {
    let endpoint = '/search/movie';
    let options = new HttpParams()
      .append('api_key', this.TMDB_APIKEY)
      .append('language', 'fr')
      .append('query', userInput);
    
    return this.http.get(this.TMDB_API+endpoint, {params:options})
      .pipe(map(
        (response: any) => response.results.map(
            (movie:any) => new Movie(movie))
          )
      );
  }

  get movies$():Observable<Movie[]> {
    return this._movies$.asObservable();
  }

  getDetails(id:number):Observable<Movie> {
    let endpoint = '/movie/'+id;
    let options = new HttpParams()
      .append('api_key', this.TMDB_APIKEY)
      .append('language', 'fr')
    
    return this.http.get(this.TMDB_API+endpoint, {params:options})
    .pipe(map((response:any) => new Movie(response)));
  }

  getVideos(id:number):Observable<any> {
    let endpoint = '/movie/'+id+'/videos';
    let options = new HttpParams()
      .append('api_key', this.TMDB_APIKEY)
      .append('language', 'fr')
    
    return this.http.get(this.TMDB_API+endpoint, {params:options});
  }

}
