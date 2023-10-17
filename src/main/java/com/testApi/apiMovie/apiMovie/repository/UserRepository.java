package com.testApi.apiMovie.apiMovie.repository;


import com.testApi.apiMovie.apiMovie.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
