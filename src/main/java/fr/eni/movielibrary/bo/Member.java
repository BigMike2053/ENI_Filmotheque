package fr.eni.movielibrary.bo;

import java.util.List;

public class Member {

	private long id;
	private String lastName;
	private String firstName;
	private String login;
	private String password;
	private boolean isAdmin;
	private List<Opinion> listOpinions;
		
	public Member(long _id, String _lastName, String _firstName, String _login, String _password, boolean _isAdmin, List<Opinion> _listOpinions) {
		this.id = _id;
		this.lastName = _lastName;
		this.firstName = _firstName;
		this.login = _login;
		this.password = _password;
		this.isAdmin = _isAdmin;
		this.listOpinions = _listOpinions;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	public List<Opinion> getListOpinions() {
		return listOpinions;
	}

	public void setListOpinions(List<Opinion> listOpinions) {
		this.listOpinions = listOpinions;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", login=" + login
				+ ", password=" + password + ", isAdmin=" + isAdmin + ", listOpinions=" + listOpinions + "]";
	}
	
	
	
}
