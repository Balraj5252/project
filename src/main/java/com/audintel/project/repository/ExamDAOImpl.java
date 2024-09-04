package com.audintel.project.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.audintel.project.domain.Exam;

@Repository
public class ExamDAOImpl implements ExamDAO {


	@Override
	public List<Exam> getExamsBySem(Integer sem) {
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
