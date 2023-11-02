package com.hope;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


//Class to simplify the creation of EntityMangaerFactory
//and Entity Manager objects
public class CourseTableRepository {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	//Constructor initialising the objects
	public CourseTableRepository() {
		emf = Persistence.createEntityManagerFactory("pu");
		em = emf.createEntityManager();
	}
	
	//Method to add CourseTable object to the database
	public CourseTable add(CourseTable courseTable) {
		em.getTransaction().begin();
		em.persist(courseTable);
		em.getTransaction().commit();
		return courseTable;
	}
	
	//Method to find a CourseTable object in the database
	public CourseTable find(int id) {
		return em.find(CourseTable.class, id);
	}
	
	//Methods to list the courses and instructors involved with each course
	public List<CourseTable> getCourseTables(){
		Query query = em.createQuery("SELECT courseTable from CourseTable courseTable");
		return query.getResultList();
	}
	
	public List<String> getInstructorNames(){
		Query query = em.createQuery("SELECT courseTable.instructorName from CourseTable courseTable");
		return query.getResultList();
	}
}