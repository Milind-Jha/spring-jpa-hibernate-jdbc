package com.org.springbootJPAdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.org.springbootJPAdemo.bean.Course;
import com.org.springbootJPAdemo.dao.CourseJPARepository;
import com.org.springbootJPAdemo.dao.CourseJdbcRepository;
import com.org.springbootJPAdemo.dao.CourseSpringDataJPA;
import com.org.springbootJPAdemo.runner.CourseJdbcCommandLineRunner;

@SpringBootApplication
public class SpringbootJpAdemoApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(SpringbootJpAdemoApplication.class, args);
		
//		CourseJdbcRepository repository = run.getBean(CourseJdbcRepository.class);		// SPRING JDBC
//		repository.insert(new Course(13,"Qwerty"));
		
//		CourseJPARepository jpaRepository = run.getBean(CourseJPARepository.class);		// JPA
//		jpaRepository.insert(new Course(12,"jkl"));
		
		CourseSpringDataJPA springDataJPA = run.getBean(CourseSpringDataJPA.class);		//SPRING-DATA JPA
		springDataJPA.save(new Course(15,"uiop"));
		System.out.println(springDataJPA.findAll());
		//CUSTOM METHOD
		System.out.println(springDataJPA.findByName("Qwerty"));
	}
	
}
