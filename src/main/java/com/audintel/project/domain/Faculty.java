package com.audintel.project.domain;

import java.io.Serializable;



public class Faculty implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String id;
	String name;
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
