package com.hope;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Student class which holds the values of the Student 
//table in the database

@Entity
@Table(name = "STUDENT")
public class Student implements Serializable{
		
	//Variables and their database information
	@Id @Column(name = "STUDENT_ID")
	private int studentId;
	
	@Column(name="STUDENT_FIRST_NAME")
	private String studentFirstName;

	
	@Column(name="STUDENT_LAST_NAME")
	private String studentSecondName;
		
	@Column(name="COURSE")
	private String course;
		
	//Getters, setters and a toString method
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentSecondName() {
		return studentSecondName;
	}

	public void setStudentSecondName(String studentSecondName) {
		this.studentSecondName = studentSecondName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentSecondName="
				+ studentSecondName + ", studentCourses=" + course + "]";
	}
	
}
