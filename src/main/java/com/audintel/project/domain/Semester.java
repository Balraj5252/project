package com.audintel.project.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "semester")
public class Semester {
	@Id
	//@GeneratedValue
	@Column(name="id")
	String id;
	@Column
	String sem;
	@Column(name="student_id")
	String studentId;
}
