package com.audintel.project.domain;

import java.io.Serializable;

public class Scores implements Serializable{

	private Integer id;
	
	private Integer examId;
	
	private String studentId;
	
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
