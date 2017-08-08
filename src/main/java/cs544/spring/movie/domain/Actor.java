package cs544.spring.movie.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Actor {

	@Id
	@GeneratedValue
	@Column(name = "A_ID")
	int id;
	@Column(name = "ActorName")
	String name;
	@Column(name = "City")
	String city;
	@Column(name = "State")
	String state;
	@Column(name = "Country")
	String country;
	@Column(name = "DOB")
	Date dataOfBirth;
	@Column(name = "Biography")
	String biography;
	boolean[] picture;
	@ManyToMany
	@JoinTable(name = "ACTOR_MOVIE", joinColumns = @JoinColumn(name = "A_ID"), inverseJoinColumns = @JoinColumn(name = "M_ID"))
	List<Movie> movieList=new ArrayList<Movie>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getDataOfBirth() {
		return dataOfBirth;
	}
	public void setDataOfBirth(Date dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public boolean[] getPicture() {
		return picture;
	}
	public void setPicture(boolean[] picture) {
		this.picture = picture;
	}
	public List<Movie> getMovieList() {
		return movieList;
	}
	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}
	
	
}
