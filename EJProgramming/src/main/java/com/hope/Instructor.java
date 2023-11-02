package com.hope;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Instructor class which holds the values of the Instructor
//table in the database

@Entity
@Table(name = "INSTRUCTOR")
public class Instructor implements Serializable{
		
	//Variables and their database information
	@Id
	private int instructorId;
	
	@Column(name="INSTRUCTOR_FIRST_NAME")
	private String instructorFirstName;

	
	@Column(name="INSTRUCTOR_LAST_NAME")
	private String instructorSecondName;
		
	@Column(name="COURSES")
	private ArrayList<Course> instructorCourses;

	//Getters, setters and a toString method
	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorFirstName() {
		return instructorFirstName;
	}

	public void setInstructorFirstName(String instructorFirstName) {
		this.instructorFirstName = instructorFirstName;
	}

	public String getInstructorSecondName() {
		return instructorSecondName;
	}

	public void setInstructorSecondName(String instructorSecondName) {
		this.instructorSecondName = instructorSecondName;
	}

	public ArrayList<Course> getInstructorCourses() {
		return instructorCourses;
	}

	public void setInstructorCourses(ArrayList<Course> instructorCourses) {
		this.instructorCourses = instructorCourses;
	}

	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", instructorFirstName=" + instructorFirstName
				+ ", instructorSecondName=" + instructorSecondName + ", instructorCourses=" + instructorCourses + "]";
	}
	
	
}
