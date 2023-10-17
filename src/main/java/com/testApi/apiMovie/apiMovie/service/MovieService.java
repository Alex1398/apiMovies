package com.testApi.apiMovie.apiMovie.service;

import com.testApi.apiMovie.apiMovie.model.Movie;
import com.testApi.apiMovie.apiMovie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MovieService {
    private final MovieRepository movieRepository;


    public List<Movie> getAllMovies() {
        List<Movie> movies = movieRepository.findAll();

        return movies;
    }

    public Optional<List<Movie>> getMoviesByCategory(String category) {
        Optional<List<Movie>> movie = movieRepository.getMovieByCategory(category);

        return movie;
    }

    public Optional<List<Movie>> getMoviesByTag(String tag) {
        Optional<List<Movie>> movie = movieRepository.getMovieByTag(tag);

        return movie;
    }

}
