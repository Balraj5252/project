package com.audintel.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.audintel.project.domain.Question;
import com.audintel.project.repository.QuestionJPA;

@Service
@Transactional
public class QuestionService {
	@Autowired
	QuestionJPA questionJPA;
	
	public List<Question> getAllQuestions(){
		return questionJPA.findAll();
	}
	
	public void addQuestion(Question q){
	 questionJPA.save(q);
		//return qs.toString();
	}
	
	public Question getQuestion(Integer id){
		return questionJPA.getOne(id);
	}
	
	public void delete(Integer id){
		questionJPA.deleteById(id);
	}
	public List<Question> getAllQuestionBySub(String sub){
		return questionJPA.getAllQuestionbySubject(sub);
	}
	public String getAnswerById(Integer id){
		return questionJPA.getAnswer(id);
	}
}
