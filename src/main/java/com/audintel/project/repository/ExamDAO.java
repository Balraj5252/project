package com.audintel.project.repository;

import java.util.List;

import com.audintel.project.domain.Exam;

public interface ExamDAO {
	public List<Exam> getExamsBySem(Integer sem);
	
	public Exam getExamIfNotAttemted(String studentid,String examid);
}
