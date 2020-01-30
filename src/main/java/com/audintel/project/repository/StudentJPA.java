package com.audintel.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.audintel.project.domain.Student;

public interface StudentJPA  extends JpaRepository<Student, String>,StudentDAO{
	
	@Query(value="SELECT a.sem FROM semester a join student s on s.id = a.student_id where student_id=?1",nativeQuery = true)
	public Integer getsemByStudentId(String id);
}
