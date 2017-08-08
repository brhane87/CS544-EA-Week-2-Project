package cs544.spring.movie.DAO;

import cs544.spring.movie.domain.Gener;
import cs544.spring.movie.domain.Movie;

public interface MovieDAO {

	void save(Movie movie);

	void update(Movie movie);

	void delete(Movie movie);

	Movie findByTitle(String title);

	Movie findByGener(Gener gener);

	Movie findByRating(String rating);

	Movie findByDirector(String director);

	Movie findByActor(String actor);
}
