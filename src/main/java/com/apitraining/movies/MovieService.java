//this service class works with the repository and returns all the movies to the the api class MovieController

package com.apitraining.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //to let the framework know its a Service class
public class MovieService {
    @Autowired //in place of a constructor, lets the framework know we want it to instantiate this class for us
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        //System.out.println(movieRepository.findAll().toString());
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){ //Optional<Movie is used because it may have to return NULL if
        // no movie is found
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
