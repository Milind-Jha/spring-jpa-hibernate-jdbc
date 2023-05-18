package com.org.springbootJPAdemo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.org.springbootJPAdemo.bean.Course;
import com.org.springbootJPAdemo.dao.CourseJdbcRepository;

public class CourseJdbcCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(2,"AWS"));
	}

}
