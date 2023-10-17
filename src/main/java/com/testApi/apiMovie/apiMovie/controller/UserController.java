package com.testApi.apiMovie.apiMovie.controller;

import com.testApi.apiMovie.apiMovie.model.Movie;
import com.testApi.apiMovie.apiMovie.model.User;
import com.testApi.apiMovie.apiMovie.service.MovieService;
import com.testApi.apiMovie.apiMovie.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<User> getUserById(@PathVariable("id") String id) {
        return userService.getUserById(id);
    }

}
