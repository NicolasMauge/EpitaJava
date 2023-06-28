import { Component} from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { MovieService } from '../shared/services/movie.service';
import { Movie } from '../shared/model/movie';
import { DomSanitizer, SafeResourceUrl } from '@angular/platform-browser';

@Component({
  selector: 'app-movie-detail',
  templateUrl: './movie-detail.component.html',
  styleUrls: ['./movie-detail.component.css']
})
export class MovieDetailComponent {
  movieId!: number;
  movie!:Movie;
  videoDetails!:string;
  videoKey!:string;
  videoSani!:SafeResourceUrl;

  constructor(private route:ActivatedRoute, private movieService:MovieService, private sanitizer: DomSanitizer) {}

  ngOnInit() {
    this.movieId = this.route.snapshot.params['movieId'];

    this.movieService.getDetails(this.movieId).subscribe(
      (data:Movie) => this.movie=data);

    this.movieService.getVideos(this.movieId).subscribe((data:any) => {
      this.videoKey = data.results[0]['key'];
      console.log(data.results.find((trailer:any) => trailer.site=='Youtube'));
    });

  }

  getVideoUrl():SafeResourceUrl {
    return this.sanitizer.bypassSecurityTrustResourceUrl('https://youtube.com/embed/'+this.videoKey);
  }
}
