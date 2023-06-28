interface Genre {
    id: number;
    name: string;
}


export class Movie {
    id: number;
    titre: string;
    duration: number|undefined;
    resume: string;
    image_landscape: string;
    image_portrait: string;
    score: number;
    genres: Genre[];
    date: Date;

    constructor(movieFromApi: any) {
        this.id = movieFromApi.id;
        this.titre = movieFromApi.title;
        this.resume = movieFromApi.overview;
        this.image_landscape = movieFromApi.backdrop_path;
        this.image_portrait = movieFromApi.poster_path;
        this.score = movieFromApi.vote_average;
        
        //console.log(movieFromApi);

        if(movieFromApi.genre_ids != undefined) {
            this.genres = movieFromApi.genre_ids.map((item:number)=>{return {id:item, name:''} });
        } else {
            this.genres = movieFromApi.genres;
        }
        
        this.date = new Date(movieFromApi.release_date);

        if(movieFromApi.runtime!=undefined) {
            this.duration = movieFromApi.runtime;
        } else {
            this.duration = undefined;
        }
        
    }
}
