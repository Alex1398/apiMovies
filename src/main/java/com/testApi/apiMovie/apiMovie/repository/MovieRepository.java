package com.testApi.apiMovie.apiMovie.repository;

import com.testApi.apiMovie.apiMovie.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends MongoRepository<Movie, String> {
    @Query("{genre : ?0}")
    Optional<List<Movie>> getMovieByCategory(String genre);

    @Query("{tag : ?0}")
    Optional<List<Movie>> getMovieByTag(String tag);
}
