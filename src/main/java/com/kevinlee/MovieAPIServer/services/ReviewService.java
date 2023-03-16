package com.kevinlee.MovieAPIServer.services;

import com.kevinlee.MovieAPIServer.domain.Review;

/**
 * Created by Kevin Lee on 3/16/23
 */
public interface ReviewService {
    public Review createReview(String reviewBody, String imdbId);
}
