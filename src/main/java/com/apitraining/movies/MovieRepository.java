//The data access layer of the app, does the job of talking to the db and getting data back

package com.apitraining.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //to let the framework know this is a repository - repositories are interfaces in Java
public interface MovieRepository extends MongoRepository<Movie, ObjectId> { //need to let it know the data type and id
    Optional<Movie> findMovieByImdbId(String ImdbId); //this is so we can use the IMDB id to search movies
    //this format can be used with any unique class id
}
