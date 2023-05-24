package fr.eni.movielibrary.bo;

import java.util.List;

public class Participant {
	
	private long id;
	private String lastName;
	private String firstName;
	private List<Movie> listMoviesAsDirector;
	private List<Movie> listMoviesAsActor;
	
	
	public Participant(long _id, String _lastName, String _firstName, List<Movie> _listMoviesAsDirector, List<Movie> _listMoviesAsActor) {
		this.id = _id;
		this.lastName = _lastName;
		this.firstName = _firstName;
		this.listMoviesAsDirector = _listMoviesAsDirector;
		this.listMoviesAsActor = _listMoviesAsActor;
	}

	public Participant(long id, String lastName, String firstName) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public List<Movie> getListMoviesAsDirector() {
		return listMoviesAsDirector;
	}


	public void setListMoviesAsDirector(List<Movie> listMoviesAsDirector) {
		this.listMoviesAsDirector = listMoviesAsDirector;
	}


	public List<Movie> getListMoviesAsActor() {
		return listMoviesAsActor;
	}


	public void setListMoviesAsActor(List<Movie> listMoviesAsActor) {
		this.listMoviesAsActor = listMoviesAsActor;
	}


	@Override
	public String toString() {
		return "Participant [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", listMoviesAsDirector=" + listMoviesAsDirector + ", listMoviesAsActor=" + listMoviesAsActor + "]";
	}
	
	
}
