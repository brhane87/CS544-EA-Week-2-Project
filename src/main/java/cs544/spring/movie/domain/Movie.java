package cs544.spring.movie.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.*;

@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "M_ID")
	int id;
	@Column(name = "MovieTitle")
	String title;
	@Column(name = "Discription")
	String discription;
	@Column(name = "Gener")
	@Enumerated
	Gener gener;
	@Column(name = "Director")
	String director;
	@Column(name = "Year")
	Date year;
	@ManyToMany(mappedBy="movieList",fetch=FetchType.EAGER)
	List<Actor> actors=new ArrayList<>();
	
	@OneToMany(mappedBy="movie_Id")
	List<Season> season=new ArrayList<>();
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Gener getGener() {
		return gener;
	}

	public void setGener(Gener gener) {
		this.gener = gener;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}
}
