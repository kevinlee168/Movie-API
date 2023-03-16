package com.kevinlee.MovieAPIServer.services;

import com.kevinlee.MovieAPIServer.domain.Movie;
import com.kevinlee.MovieAPIServer.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kevin Lee on 3/16/23
 */

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie findMovieByImdbId(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId).orElse(null);
    }

    @Override
    public List<Movie> findAllMovies() {
        return movieRepository.findAll();
    }
}
