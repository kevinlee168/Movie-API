package com.kevinlee.MovieAPIServer.services;

import com.kevinlee.MovieAPIServer.domain.Movie;
import com.kevinlee.MovieAPIServer.domain.Review;
import com.kevinlee.MovieAPIServer.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by Kevin Lee on 3/16/23
 */
@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Review createReview(String reviewBody, String imdbId) {
        Review review = reviewRepository.insert(new Review(reviewBody, LocalDateTime.now(), LocalDateTime.now()));

        // update the reviews of the movie (imdbId)
        mongoTemplate.update(Movie.class).matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviews").value(review))
                .first();

        return review;
    }
}
