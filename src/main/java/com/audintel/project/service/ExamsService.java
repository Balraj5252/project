package com.audintel.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.audintel.project.domain.Exam;
import com.audintel.project.repository.ExamJPA;

@Service
public class ExamsService {
	@Autowired
	ExamJPA ej;
	
	public List<Exam> getAllExam(){
		return ej.findAll();
	}
	
	public String addExam(Exam e){
		return ej.save(e).toString();
	}
	
	public Exam getExam(String id){
		return ej.findById(id).get();
	}
	public void deleteExam(String id){
		ej.deleteById(id);
	}
	public List<Exam> getAllExamBySem(Integer sem){
		
		return ej.getExamsBySem(sem);
		
	}
	
}
