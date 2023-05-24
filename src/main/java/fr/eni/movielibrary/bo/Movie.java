package fr.eni.movielibrary.bo;

import java.util.List;

public class Movie {
	
	private long id;
	private String title;
	private int year;
	private int duration;
	private String synopsis;
	private Participant director;
	private List<Participant> listActors;
	private Genre genre;
	
	
	public Movie(long _id, String _title, int _year, int _duration, String _synopsis, Participant _director,
			List<Participant> _listActors, Genre _genre) {
		this.id = _id;
		this.title = _title;
		this.year = _year;
		this.duration = _duration;
		this.synopsis = _synopsis;
		this.director = _director;
		this.listActors = _listActors;
		this.genre = _genre;
	}
	
	
	public Movie(long _id, String _title, int _year, int _duration, String _synopsis) {
		super();
		this.id = _id;
		this.title = _title;
		this.year = _year;
		this.duration = _duration;
		this.synopsis = _synopsis;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String getSynopsis() {
		return synopsis;
	}


	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}


	public Participant getDirector() {
		return director;
	}


	public void setDirector(Participant director) {
		this.director = director;
	}


	public List<Participant> getListActors() {
		return listActors;
	}


	public void setListActors(List<Participant> listActors) {
		this.listActors = listActors;
	}


	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}


	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", year=" + year + ", duration=" + duration + ", synopsis="
				+ synopsis + ", director=" + director + ", listActors=" + listActors + ", genre=" + genre + "]";
	}
	

}
