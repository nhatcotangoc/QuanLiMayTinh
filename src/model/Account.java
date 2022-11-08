/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

public class Account {
	private String fullName;
	private String userName;
	private String password;
	private String role;
	
	
	public Account() {
		super();
	}


	public Account(String fullName, String userName, String password, String role) {
		super();
		this.fullName = fullName;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getUser() {
		return userName;
	}


	public void setUser(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public int hashCode() {
		return Objects.hash(password, role, userName, fullName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(password, other.password) && Objects.equals(role, other.role)
				&& Objects.equals(userName, other.userName) && Objects.equals(fullName, other.fullName);
	}


	@Override
	public String toString() {
		return "Account [fullName=" + fullName + ", userName=" + userName + ", password=" + password + ", role=" + role + "]";
	}
	
	
}
 

