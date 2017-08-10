package cs544.spring.movie.DAO;

import java.util.List;

import cs544.spring.movie.domain.Gener;
import cs544.spring.movie.domain.Movie;

public interface MovieDAO {

	void save(Movie movie);

	void update(Movie movie);

	void delete(Movie movie);

	Movie findByTitle(String title);

	List<Movie> findByGener(Gener gener);

	List<Movie> findByRating(String rating);

	List<Movie> findByDirector(String director);

	List<Movie> findByActor(String actor);
}
