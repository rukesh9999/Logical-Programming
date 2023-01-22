package com.logics.javaconcepts;

import java.util.Objects;

public class Worker {

	private int code;
	private String name;
	private String department ;
	
	
	
	public Worker() {
	
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Worker(int code, String name, String department) {
		
		this.code = code;
		this.name = name;
		this.department = department;
	}




	@Override
	public int hashCode() {
		return Objects.hash(code, department, name);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		return code == other.code && Objects.equals(department, other.department) && Objects.equals(name, other.name);
	}




	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	@Override
	public String toString() {
		return "Worker [code=" + code + ", name=" + name + ", department=" + department + "]";
	}
	
	
}
