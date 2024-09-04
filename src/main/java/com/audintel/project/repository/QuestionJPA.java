package com.audintel.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.audintel.project.domain.Question;


public interface QuestionJPA extends CrudRepository<Question, Integer>,QuestionDAO{

}
