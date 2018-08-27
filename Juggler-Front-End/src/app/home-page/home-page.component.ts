import { Component, OnInit } from '@angular/core';
import { SearchDataService } from '../search-data.service';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.scss']
})
export class HomePageComponent implements OnInit {
  movies = [{'movieTitle': 'Gold', 'movieposter': 'https://assetscdn.paytm.com/images/cinema/MovieIcons/Gold-web-poster-updated.jpg'},
  {'movieTitle': 'Geeta Govindam', 'movieposter': 'https://assetscdn.paytm.com/images/cinema/MovieIcons/Geetha-Govindam-web-poster.jpg'},
  {'movieTitle': 'Happy Phir bhag jayeghi', 'movieposter': 'https://s3-ap-southeast-1.amazonaws.com/assets.paytm.com/images/cinema/Happy-phirr-bhag-jayegi-web-poster-214c1486-e7e3-4f94-bd64-bbeaadf6f3ff.jpg'},
  {'movieTitle': 'Mile22', 'movieposter': 'https://assetscdn1.paytm.com/images/catalog/view_item/195582/1535023771411.jpg'}];
  constructor(private cityService: SearchDataService) { }

  ngOnInit() {
    // this.cityService.getAllMovies().subscribe(fullList => this.movies = fullList);
  }
  getMovieInfo(movie) {
    console.log(movie);
  }
}
