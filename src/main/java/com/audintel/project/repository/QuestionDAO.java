package com.audintel.project.repository;

import java.util.List;

import com.audintel.project.domain.Question;

public interface QuestionDAO {
	//public void addQuestion(Question question);
	public List<Question> getAllQuestionbySubject(String sub);
	public String getAnswer(Integer id);
}
