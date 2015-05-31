package swnTestGroup_0.model;

public class User {
	
	private String login;
	private String password;
	
	private String getLogin() {
		return login;
	}
	
	public User setLogin(String login) {
		this.login = login;
		return this;
	}
	
	private String getPassword() {
		return password;
	}
	
	public User setPassword(String password) {
		this.password = password;
		return this;
	}
	
}
