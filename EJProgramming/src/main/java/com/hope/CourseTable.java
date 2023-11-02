package com.hope;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**CourseTable which holds the values of the course_table 
table in the database. Acted as the first table used for 
setting up and testing functionality with database communication.
Would have opted for using a combination of the Course and 
Instructor tables and classes but ran out of time. */
@Entity
@Table(name = "course_table")
public class CourseTable implements Serializable{
	
	//Variables and their database information
	@Id @Column(name="courseId")
	private int courseId;
	
	@Column(name="courseName")
	private String courseName;
	
	@Column(name="instructorId")
	private int instructorId;
	
	@Column(name="instructorName")
	private String instructorName;

	//Getters, setters and a toString method
	public int getCourseId() {
		return courseId;
	}

	public void setCustomerId(int customerId) {
		this.courseId = customerId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	@Override
	public String toString() {
		return "CourseTable [customerId=" + courseId + ", courseName=" + courseName + ", instructorId=" + instructorId
				+ ", instructorName=" + instructorName + "]";
	}
}