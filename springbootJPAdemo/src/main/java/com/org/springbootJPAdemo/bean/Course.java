package com.org.springbootJPAdemo.bean;

import javax.validation.constraints.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Course")
public class Course {
	
	@Id
	private int id;
	
	@NotNull
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
}
