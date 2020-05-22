package com.training.bean;

public class LoginBean {
	private String userName;
	private String Email;
	private String Firstname;
	private String Lastname;
	private String Website;	
	private String password;
	private String Role;

	public LoginBean() {
	}

	public LoginBean(String userName, String Email,String Firstname,String Lastname,String Website,String password,String Role) {
		super();
		this.userName = userName;
		this.Email = Email;
		this.Firstname = Firstname;
		this.Lastname =Lastname;
		this.Website = Website;
		this.password = password;
		this.Role = Role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	
	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String Firstname) {
		this.Firstname = Firstname;
	}
	
	
	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String Lastname) {
		this.Lastname = Lastname;
	}
	
	
	public String getWebsite() {
		return Website;
	}

	public void setWebsite(String Website) {
		this.Website = Website;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return Role;
	}

	public void setRole(String Role) {
		this.Role = Role;
	}

	@Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", Email=" + Email + ", Firstname=" + Firstname + ",Lastname=" + Lastname + ",Website=" + Website + ",password=" + password + ",Role=" + Role + "]";
	}

}
