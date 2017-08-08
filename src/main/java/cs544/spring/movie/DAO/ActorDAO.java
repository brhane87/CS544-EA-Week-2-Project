package cs544.spring.movie.DAO;

import cs544.spring.movie.domain.Actor;
import cs544.spring.movie.domain.Gener;
import cs544.spring.movie.domain.Movie;

public interface ActorDAO {
	
	void save(Actor actor);

	void update(Actor actor);

	void delete(Actor actor);

	Movie findByTitle(String title);

	Movie findByGener(Gener gener);

	Movie findByRating(String rating);

	Movie findByDirector(String director);

}
