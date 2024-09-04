package com.audintel.project.repository;

import com.audintel.project.domain.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentJPA  extends CrudRepository<Student, String>,StudentDAO{
	
	public Integer getsemByStudentId(String id);
}
