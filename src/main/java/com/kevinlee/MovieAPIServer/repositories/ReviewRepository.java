package com.kevinlee.MovieAPIServer.repositories;

import com.kevinlee.MovieAPIServer.domain.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Kevin Lee on 3/16/23
 */
@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {}
