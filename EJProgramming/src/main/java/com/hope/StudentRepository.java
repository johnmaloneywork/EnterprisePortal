package com.hope;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


//Class to simplify the creation of EntityMangaerFactory
//and Entity Manager objects
public class StudentRepository {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	//Constructor initialising the objects
	public StudentRepository() {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
	}
	
	//Method to add Student object to the database
	public Student add(Student student) {
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		return student;
	}
	
	//Method to add Course to the database
	public Course addCourse(Course course) {
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		return course;
	}
	
	//Method to update Student object in the database
	public Student update(Student student) {
		Student studentToUpdate = find(student.getStudentId());
		em.getTransaction().begin();
		studentToUpdate.setStudentFirstName(student.getStudentFirstName());
		studentToUpdate.setStudentSecondName(student.getStudentSecondName());
		studentToUpdate.setCourse(student.getCourse());
		em.getTransaction().commit();
		return studentToUpdate;
	}
	
	//Method to find Student object in the database
	public Student find(int id) {
		return em.find(Student.class, id);
	}

}