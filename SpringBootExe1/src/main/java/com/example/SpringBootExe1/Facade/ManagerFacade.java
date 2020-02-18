package com.example.SpringBootExe1.Facade;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.SpringBootExe1.beans.Course;
import com.example.SpringBootExe1.beans.Lecturer;
import com.example.SpringBootExe1.db.CourseRepository;
import com.example.SpringBootExe1.db.LecturerRepository;
import com.example.SpringBootExe1.exceptions.courseExistsException;
import com.example.SpringBootExe1.exceptions.emailExistsException;

@Component // transactional?
public class ManagerFacade {

	@Autowired
	private LecturerRepository lectDBD;
	@Autowired
	private CourseRepository courseDBD;

	public void addLecturer(Lecturer l) throws emailExistsException {
		for (Lecturer lect : lectDBD.findAll()) {
			if (lect.getEmail().equals(l.getEmail()))
				throw new emailExistsException();

		}
		lectDBD.save(l);
	}

	public void deleteLecturer(int id) {
		for (Course c : courseDBD.findAll()) {
			if (c.getLecti().getId() == id) {
				courseDBD.delete(c);
			}

		}lectDBD.deleteById(id);

	}
	
	public List<Lecturer>getAllLecturers(){
		return lectDBD.findAll();
	}
	
	public Lecturer findById(int id) {
		return lectDBD.findById(id).orElse(null);
	}
	
	
	public void addCourse(Course c) throws courseExistsException {
		for (Course cori : courseDBD.findAll()) {
			if(cori.getName()==c.getName())
				throw new courseExistsException();
		} courseDBD.save(c);
	}
	
	
	public void deleteCourse(int number) {
		courseDBD.deleteById(number);;
	}
	
	public List<Course>getAllcourses(){
		return courseDBD.findAll();
	}
	
	
	public Course getCourseByNumber(int number) {
		return courseDBD.findById(number).orElse(null);
	}
	
	
	
	
}
