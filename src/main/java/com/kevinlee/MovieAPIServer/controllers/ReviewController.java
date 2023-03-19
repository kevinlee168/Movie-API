package com.kevinlee.MovieAPIServer.controllers;

import com.kevinlee.MovieAPIServer.domain.Review;
import com.kevinlee.MovieAPIServer.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Kevin Lee on 3/19/23
 */
@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService service;

    @PostMapping()
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> playroad) {
        return new ResponseEntity<Review>(service.createReview(playroad.get("reviewBody"),
                playroad.get("imdbId")),
                HttpStatus.OK);
    }

}
