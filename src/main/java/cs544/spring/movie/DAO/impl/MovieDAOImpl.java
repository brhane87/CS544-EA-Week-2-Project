package cs544.spring.movie.DAO.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import cs544.spring.movie.DAO.MovieDAO;
import cs544.spring.movie.domain.Gener;
import cs544.spring.movie.domain.Movie;

@SuppressWarnings("unchecked")
public class MovieDAOImpl implements MovieDAO {
	
	@PersistenceContext
    protected EntityManager entityManager;

	public void save(Movie movie) {
		entityManager.persist( movie );

	}

	public void update(Movie movie) {
		entityManager.persist(movie);

	}

	public void delete(Movie movie) {
		entityManager.remove( movie );

	}

	public Movie findByTitle(String title) {
		Query query = entityManager.createQuery("select m from movies m  where m.title =:title");
		return (Movie) query.setParameter("title", title).getSingleResult();
	}

	
	public List<Movie> findByGener(Gener gener) {
		Query query = entityManager.createNamedQuery("select m from movies where m.gener =:gener");
		return (List<Movie>) query.getResultList();
	}

	public List<Movie> findByRating(String rating) {
		
		Query query = entityManager.createNamedQuery("select m from movies where m.rating =:rating");
		return (List<Movie>) query.getResultList();
	}

	public List<Movie> findByDirector(String director) {
		
		Query query = entityManager.createNamedQuery("select m from movies where m.rating =:rating");
		return (List<Movie>) query.getResultList();
	}

	public List<Movie> findByActor(String actor) {
		
		Query query = entityManager.createNamedQuery("select m from movies where m.actor =:actor");
		return (List<Movie>) query.getResultList();
	}

}
