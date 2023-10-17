package com.testApi.apiMovie.apiMovie;

import com.testApi.apiMovie.apiMovie.model.MetadataInfo;
import com.testApi.apiMovie.apiMovie.model.Movie;
import com.testApi.apiMovie.apiMovie.model.Preferences;
import com.testApi.apiMovie.apiMovie.model.User;
import com.testApi.apiMovie.apiMovie.repository.MovieRepository;
import com.testApi.apiMovie.apiMovie.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ApiMovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiMovieApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner loadData(MovieRepository movieRepository, UserRepository userRepository) {
//		return args -> {
//			Movie movie = new Movie();
//			movie.setTitle("Movie1");
//			movie.setDescription("Horror test ... ");
//			movie.setGenre("Horror");
//			movie.setTag("TAG1");
//			movie.setLength(120);
//			movie.setDateReleased(LocalDateTime.now());
//			movie.setDateAvailableUntil(LocalDateTime.of(2024, 7, 13, 10, 12));
//
//			MetadataInfo metadataInfo = new MetadataInfo();
//			List<String> urls = new ArrayList<String>();
//			urls.add("url1");
//			urls.add("url2");
//
//			metadataInfo.setImages(urls);
//			metadataInfo.setMetaTitle("Metatada title movie 1");
//			metadataInfo.setMetaDescription("Metatada desc movie 1");
//			movie.setMetadataInfo(metadataInfo);
//
//			Movie movie2 = new Movie();
//			movie2.setTitle("Movie2");
//			movie2.setDescription("Drama test ... ");
//			movie2.setGenre("Drama");
//			movie2.setTag("TAG2");
//			movie2.setLength(140);
//			movie2.setDateReleased(LocalDateTime.now());
//			movie2.setDateAvailableUntil(LocalDateTime.of(2025, 9, 12, 10, 12));
//
//			MetadataInfo metadataInfo2 = new MetadataInfo();
//			metadataInfo2.setImages(urls);
//			metadataInfo2.setMetaTitle("Metatada title movie 2");
//			metadataInfo2.setMetaDescription("Metatada desc movie 2");
//			movie2.setMetadataInfo(metadataInfo2);
//
//			User user = new User();
//			user.setEmail("alex@test.com");
//			user.setPhoneNumber("0781302853");
//			List<Movie> movieList =  new ArrayList<Movie>();
//			movieList.add(movie);
//			movieList.add(movie2);
//			user.setMovies(movieList);
//			Preferences preferences = new Preferences();
//			preferences.setFavoriteCategories("Horror");
//			preferences.setWebsiteTheme("Dark");
//			user.setPreferences(preferences);
//
//			User user2 = new User();
//			user2.setEmail("alex_123@test.com");
//			user2.setPhoneNumber("0741352871");
//			List<Movie> movieList2 =  new ArrayList<Movie>();
//			movieList2.add(movie2);
//			user2.setMovies(movieList2);
//			Preferences preferences2 = new Preferences();
//			preferences2.setFavoriteCategories("Drama");
//			preferences2.setWebsiteTheme("Light");
//			user2.setPreferences(preferences2);
//
//			movieRepository.save(movie);
//			movieRepository.save(movie2);
//			userRepository.save(user);
//			userRepository.save(user2);
//		};
//	}

}
