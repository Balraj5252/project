package com.audintel.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.audintel.project.domain.Exam;

public interface ExamJPA extends JpaRepository<Exam, String>,ExamDAO{

}
