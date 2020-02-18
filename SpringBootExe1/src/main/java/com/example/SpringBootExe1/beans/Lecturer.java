package com.example.SpringBootExe1.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="lecturers")
public class Lecturer {
 
	@Id//Primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	@Column
	private String email;
	
	@OneToMany(mappedBy="lecti",fetch=FetchType.EAGER)
	private List<Course>courses;

	public Lecturer(String name, String email) {//no need id->AI
		super();
		this.name = name;
		this.email = email;
		
	}

	public Lecturer() {//Hibernate
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public List<Course> getCourses() {
		return courses;
	}

	@Override
	public String toString() {
		return "Lecturer [id=" + id + ", name=" + name + ", email=" + email + ", courses=" + courses + "]";
	}

	
	
	
}
