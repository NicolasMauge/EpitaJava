import { Component } from '@angular/core';
import { MovieService } from '../shared/services/movie.service';
import { Movie } from '../shared/model/movie';

@Component({
  selector: 'app-searchbar',
  templateUrl: './searchbar.component.html',
  styleUrls: ['./searchbar.component.css']
})
export class SearchbarComponent {
  movieResults: Movie[] = [];
  
  constructor(private movieService: MovieService) {
    console.log(this);
  }

  onKeyupInput(userInput:string) {
    if(userInput.length>3) {
      this.movieService.searchMovie(userInput).subscribe(
        (data:Movie[]) => this.movieResults = data
      );
    } else {
      this.movieResults = [];
    }
  }
}
