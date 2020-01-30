package com.audintel.project.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.audintel.project.domain.Question;
@Repository
@Transactional
public class QuestionDAOImpl implements QuestionDAO{
@PersistenceContext
EntityManager em;
//	@Override
//	public void addQuestion(Question question) throws PersistenceException{
//		try {
//			em.persist(question);
//		} catch (PersistenceException e) {
//			e.printStackTrace();
//			throw e;
//		}
	//}
	@Override
	public List<Question> getAllQuestionbySubject(String sub) {
		try{
			Query q = em.createQuery("select a from Question a where subject = ?1",Question.class);
			q.setParameter(1, sub);
			List<Question> qs = q.getResultList(); 
			return qs;
		}catch(Exception e){
			throw e;
		}
	}
	@Override
	public String getAnswer(Integer id) {
		try {
			Query q = em.createQuery("select a.answer from Question a where id = ?1");
			q.setParameter(1, id);
			return (String) q.getSingleResult();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	
	

}
