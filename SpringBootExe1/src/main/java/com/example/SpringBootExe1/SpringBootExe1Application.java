package com.example.SpringBootExe1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.SpringBootExe1.Facade.ManagerFacade;
import com.example.SpringBootExe1.beans.Course;
import com.example.SpringBootExe1.beans.Lecturer;
import com.example.SpringBootExe1.exceptions.courseExistsException;
import com.example.SpringBootExe1.exceptions.emailExistsException;

@SpringBootApplication
public class SpringBootExe1Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootExe1Application.class, args);
	ManagerFacade meni=ctx.getBean(ManagerFacade.class);
//	Lecturer l=new Lecturer("meirav","sharabi");
//	Lecturer l2=new Lecturer("mona","farhadi");
//	//note:first create the "one" to which "many" refer to!!
//	try {
//		meni.addLecturer(l2);
//	} catch (emailExistsException e1) {System.out.println(e1.getMessage());
//	}
//	
//	try {
//		meni.addCourse(new Course("physics",34,l2));
//	} catch (courseExistsException e) {System.out.println(e.getMessage());
//	}
//	}
//	

	//meni.deleteCourse(3);
	//meni.deleteLecturer(5);
	//System.out.println(meni.findById(2));
	//System.out.println(meni.findById(1));
//	for (Lecturer l : meni.getAllLecturers()) {
//		System.out.println(l);
//	}
	
//	for (Course c : meni.getAllcourses()) {
//		System.out.println(c);
//	}

	System.out.println(meni.getCourseByNumber(5));
	
	}

}
