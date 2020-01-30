package com.audintel.project.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Faculty implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	String id;
	@Column(name = "name")
	String name;
	@Column(name = "subject")
	String subject;
	
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Faculty(String id, String name, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
	}
	public Faculty() {
		super();
	}
	

	
	
}
