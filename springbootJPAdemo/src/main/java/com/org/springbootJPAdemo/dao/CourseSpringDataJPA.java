package com.org.springbootJPAdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springbootJPAdemo.bean.Course;

public interface CourseSpringDataJPA extends JpaRepository<Course, Integer> {
	
	//CUSTOM METHODS
	List<Course> findByName(String name);
}
