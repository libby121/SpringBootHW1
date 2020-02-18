package com.example.SpringBootExe1.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.SpringBootExe1.beans.Course;


@Component
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
