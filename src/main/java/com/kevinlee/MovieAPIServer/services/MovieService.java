package com.kevinlee.MovieAPIServer.services;

import com.kevinlee.MovieAPIServer.domain.Movie;

import java.util.List;

/**
 * Created by Kevin Lee on 3/16/23
 */
public interface MovieService {
    Movie findMovieByImdbId(String imdbId);

    List<Movie> findAllMovies();
}
