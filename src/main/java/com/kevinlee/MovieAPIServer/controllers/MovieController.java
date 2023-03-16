package com.kevinlee.MovieAPIServer.controllers;
import com.kevinlee.MovieAPIServer.domain.Movie;
import com.kevinlee.MovieAPIServer.services.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Kevin Lee on 3/16/23
 */
@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {this.movieService = movieService;}

    @GetMapping
    public ResponseEntity<List<Movie>> getMovies() {
        return new ResponseEntity<>(movieService.findAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Movie> getSignleMovie(@PathVariable String imdbId) {
        return new ResponseEntity<>(movieService.findMovieByImdbId(imdbId), HttpStatus.OK);
    }
}
