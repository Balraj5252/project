package com.audintel.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.audintel.project.domain.Student;
import com.audintel.project.repository.StudentJPA;

@Service
public class StudentService {
	//@Autowired
	StudentJPA sj;

	
	public String addStudent(Student s){
		return sj.save(s).toString();
	}
	public Integer verifyStudent(String s){
		if(sj.existsById(s)){
			Integer x = sj.getsemByStudentId(s);
			return x;
		}
		return null;
	}
}
