package com.org.springbootJPAdemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.org.springbootJPAdemo.bean.Course;

@Repository
public class CourseJdbcRepository {
	
	@Autowired
	JdbcTemplate springJdbcTemplate;
	
	private static String query ="insert into course (id, name)"
								+ "values(?,?)";
	
	public void insert(Course course) {
		springJdbcTemplate.update(query,course.getId(), course.getName());
	}
}
