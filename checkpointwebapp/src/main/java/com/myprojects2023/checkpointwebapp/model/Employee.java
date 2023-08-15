package com.myprojects2023.checkpointwebapp.model;

import com.myprojects2023.checkpointapi.model.Role;

import lombok.Data;


@Data
public class Employee {

    private Long id;
    
    private String firstName;

    private String lastName;

    private String mail;

    private String password;
    
//    private int role;
    private Role role;  // Utilisez le type Role au lieu de int

    public Long getId() {
		return id;
	}
    
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	

}
