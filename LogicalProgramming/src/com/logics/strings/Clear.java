package com.logics.strings;

import java.util.Objects;

public class Clear {

	private String firstName;
	private String lastName;
	private Integer clearId;
	
	
	
	
	public Clear() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Clear(String firstName, String lastName, Integer clearId) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.clearId = clearId;
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
	public Integer getClearId() {
		return clearId;
	}
	public void setClearId(Integer clearId) {
		this.clearId = clearId;
	}
	
	
	
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(clearId, firstName, lastName);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clear other = (Clear) obj;
		return Objects.equals(clearId, other.clearId) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}



	@Override
	public String toString() {
		return "Clear [firstName=" + firstName + ", lastName=" + lastName + ", clearId=" + clearId + "]";
	}
	
	
	
}
