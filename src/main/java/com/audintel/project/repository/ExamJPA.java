package com.audintel.project.repository;


import com.audintel.project.domain.Exam;
import org.springframework.data.repository.CrudRepository;

public interface ExamJPA extends CrudRepository<Exam, String>,ExamDAO{

}
