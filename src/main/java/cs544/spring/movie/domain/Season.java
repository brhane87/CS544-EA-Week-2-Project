package cs544.spring.movie.domain;

import java.util.List;

import javax.persistence.*;

public class Season {
	
	@Id @GeneratedValue(strategy =GenerationType.AUTO)
	int id; 
	List<String> epsiode;
	@ManyToOne(fetch=FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	Movie movie_Id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getEpsiode() {
		return epsiode;
	}
	public void setEpsiode(List<String> epsiode) {
		this.epsiode = epsiode;
	}
	public Movie getMovie_Id() {
		return movie_Id;
	}
	public void setMovie_Id(Movie movie_Id) {
		this.movie_Id = movie_Id;
	}
	
}
