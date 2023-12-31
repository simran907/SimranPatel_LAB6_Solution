package com.greatlearning.studentfest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue

	@Column(name = "id")
	private int id;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "course")
	private String course;

	@Column(name = "country")
	private String country;

	public Student() {

	}

	public Student(String firstName, String lastName, String course, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.country = country;
	}

	public void setFirstName(String firstName2) {
		// TODO Auto-generated method stub
		
	}

	public void setCourse(String course2) {
		// TODO Auto-generated method stub
		
	}

	public void setLastName(String lastName2) {
		// TODO Auto-generated method stub
		
	}

	public void setCountry(String country2) {
		// TODO Auto-generated method stub
		
	}

}
