package com.hope;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COURSE")
public class Course implements Serializable{
		
	@Id @Column(name="COURSE_ID")
	private int courseId;
	
	@Column(name="COURSE_NAME")
	private String courseName;

	
	@Column(name="COURSE_INSTRUCTOR")
	private Instructor instructor;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public Instructor getInstructor() {
		return instructor;
	}


	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}


	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", instructor=" + instructor + "]";
	}
	
}
