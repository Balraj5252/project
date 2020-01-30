package com.audintel.project.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "exam")
public class Exam {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	@Column(name = "name")
	String name;
	@Column(name = "semester",nullable=false)
	Integer semester;
	
	
	
	@Column(name = "faculty_id",nullable = false)
	private String facultyId;
	
	@ManyToMany
	@JoinTable(name ="exam_questions",joinColumns={
			@JoinColumn(name = "exam_id") },inverseJoinColumns = {
					@JoinColumn(name= "question_id")})
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
