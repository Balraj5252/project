package com.audintel.project.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.audintel.project.domain.Exam;

@Transactional
@Repository
public class ExamDAOImpl implements ExamDAO {
@Autowired
EntityManager em;


	@Override
	public List<Exam> getExamsBySem(Integer sem) {
		try {
			Query q = em.createQuery("select a from Exam a where semester = ?1");
			q.setParameter(1, sem);
			return q.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}



	@Override
	public Exam getExamIfNotAttemted(String studentid, String examid) {
		try {
			//Query q = em.createQuery("select ,")
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	
	

}
