package com.testApi.apiMovie.apiMovie.controller;

import com.testApi.apiMovie.apiMovie.model.Movie;
import com.testApi.apiMovie.apiMovie.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/category={category}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<List<Movie>> getMoviesByCategory(@PathVariable("category") String category) {
        return movieService.getMoviesByCategory(category);
    }

    @GetMapping("/tag={tag}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<List<Movie>> getMoviesByTag(@PathVariable("tag") String tag) {
        return movieService.getMoviesByTag(tag);
    }

}
