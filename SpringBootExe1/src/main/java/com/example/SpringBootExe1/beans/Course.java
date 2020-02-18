package com.example.SpringBootExe1.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="courses")
public class Course {

	@Id//Primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int number;
	
	@Column
	private String name;
	
	@Column
	private int duration;
	
	@ManyToOne
	private Lecturer lecti;

	public Course(String name, int duration, Lecturer lecti) {
		super();
		this.name = name;
		this.duration = duration;
		this.lecti = lecti;
	}

	public Course() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Lecturer getLecti() {
		return lecti;
	}

	public void setLecti(Lecturer lecti) {
		this.lecti = lecti;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Course [number=" + number + ", name=" + name + ", duration=" + duration + "]";
	}






}



