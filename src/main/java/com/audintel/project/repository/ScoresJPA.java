package com.audintel.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.audintel.project.domain.Scores;
public interface ScoresJPA extends CrudRepository<Scores, Integer> {
	 List<Integer> getAttemptedExamsListByStudent(String id);
	Integer getScore(String id,Integer examid);
}
