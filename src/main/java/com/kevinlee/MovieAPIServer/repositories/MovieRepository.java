package com.kevinlee.MovieAPIServer.repositories;

import com.kevinlee.MovieAPIServer.domain.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by Kevin Lee on 3/16/23
 */
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByImdbId(String imdbId);
}
