package com.audintel.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.audintel.project.domain.Question;


@Repository
public interface QuestionJPA extends JpaRepository<Question, Integer>,QuestionDAO{

}
