package com.hope;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


//Class to simplify the creation of EntityMangaerFactory
//and Entity Manager objects
public class CourseRepository {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	//Constructor initialising the objects
	public CourseRepository() {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
	}
	
	//Method to add CourseTable object to the database
	public Course add(Course course) {
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		return course;
	}
	
	//Method to find a CourseTable object in the database
	public Course find(int id) {
		return em.find(Course.class, id);
	}
	
	//Methods to list the courses
	public List<Course> getCourseTables(){
		Query query = em.createQuery("SELECT course FROM Course course");
		return query.getResultList();
	}
}