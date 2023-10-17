package com.testApi.apiMovie.apiMovie.service;

import com.testApi.apiMovie.apiMovie.model.Movie;
import com.testApi.apiMovie.apiMovie.model.User;
import com.testApi.apiMovie.apiMovie.repository.MovieRepository;
import com.testApi.apiMovie.apiMovie.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {
    private final UserRepository userRepository;


    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();

        return users;
    }

    public Optional<User> getUserById(String id) {
        Optional<User> user = userRepository.findById(id);

        return user;
    }
}
