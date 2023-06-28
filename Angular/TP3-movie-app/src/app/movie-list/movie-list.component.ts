import { Component } from '@angular/core';
import { MovieService } from '../shared/services/movie.service';
import { Movie } from '../shared/model/movie';

@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css']
})
export class MovieListComponent {
  movies: Movie[] = [];

  constructor(private movieService: MovieService) {
    console.log(this);
  }

  ngOnInit() {
    this.movieService.getMoviesFromApi();

    this.movieService.movies$.subscribe(data => this.movies = data);
  }
}
