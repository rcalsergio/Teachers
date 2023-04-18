package com.teachers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "profesores")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstname;
	private String lastname;
	private String course;

	public Teacher(Long id, String firstname, String lastname, String course) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.course = course;
	}

	public Teacher(String firstname, String lastname, String course) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.course = course;
	}

	public Teacher() {
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", nombre=" + firstname + "]";
	}


}
