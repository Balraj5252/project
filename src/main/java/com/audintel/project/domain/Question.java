package com.audintel.project.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@Table(name = "question")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Question implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;

    @Column
	String subject;
	@Column(nullable = false)
	//@NotNull
	String sem;
	@Column(nullable=false)
	//@NotNull
	String question;
	//@NotNull
	@Column(name = "option_1",nullable=false)
	String option1;
	//@NotNull
	@Column(name = "option_2",nullable=false)
	String option2;
	//@NotNull
	@Column(name = "option_3",nullable=false)
	String option3;
	//@NotNull
	@Column(name = "option_4",nullable=false)
	String option4;
	//@NotNull
	@Column(name = "answer",nullable=false)
	String answer;
	@ManyToMany( mappedBy="questions")
	private Set<Exam>  exams;
	
	
	
	public Question( String subject, String sem, String question, String option1, String option2,
			String option3, String option4, String answer) {
		super();
		//this.id = id;
		this.subject = subject;
		this.sem = sem;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
		//this.exams = exams;
	}
	public Question() {
		super();
	}
	public Integer getId() {
		return id;
	}
		public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
//	public String getAnswer() {
//		return answer;
//	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
