package com.audintel.project.domain;

import lombok.Builder;
import lombok.Data;

import java.util.Set;


@Data
public class Exam {

	Integer id;
	String name;
	Integer semester;
	private String facultyId;
	private Set<Question> questions;	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSemester() {
		return semester;
	}
	public void setSemester(Integer semester) {
		this.semester = semester;
	}
	public String getFacultyId() {
		return facultyId;
	}

	
	public Exam( String name, Integer semester, String facultyId) {
		super();
		//this.id = id;
		this.name = name;
		this.semester = semester;
		this.facultyId = facultyId;
		//this.questions = questions;
	}
	public Exam() {
		super();
	}
	public Set<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}
	
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}
	
//	List<Question> paper;
	
	
	
}
