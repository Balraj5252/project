package com.audintel.project.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.audintel.project.domain.Question;
@Repository
public class QuestionDAOImpl implements QuestionDAO{
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
			List<Question> qs = new ArrayList<>();
			return qs;
		}catch(Exception e){
			throw e;
		}
	}
	@Override
	public String getAnswer(Integer id) {
		try {

			return "";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	
	

}
