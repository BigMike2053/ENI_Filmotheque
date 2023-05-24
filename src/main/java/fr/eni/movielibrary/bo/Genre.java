package fr.eni.movielibrary.bo;

import java.util.List;

public class Genre {
	
	private long id;
	private String label;
	private List<Movie> listMovies;
	
	public Genre(long _id, String _label, List<Movie> _listMovies) {
		this.id = _id;
		this.label = _label;
		this.listMovies = _listMovies;
	}


	public Genre(long id, String label) {
		super();
		this.id = id;
		this.label = label;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	

	public List<Movie> getListMovies() {
		return listMovies;
	}

	public void setListMovies(List<Movie> listMovies) {
		this.listMovies = listMovies;
	}

	@Override
	public String toString() {
		return "Genre : " + label + "[id=" + id + "]";
	}

}
