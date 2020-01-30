package com.audintel.project.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Scores implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "exam_id")
	private Integer examId;
	
	@Column(name = "student_id")
	private String studentId;
	
	@Column(name = "marks")
	private Integer mark;

	public Integer getId() {
		return id;
	}


	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	public Scores( Integer examId, String studentId, Integer mark) {
		super();
		//this.id = id;
		this.examId = examId;
		this.studentId = studentId;
		this.mark = mark;
	}

	public Scores() {
		super();
	}
	
}
