package com.audintel.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.audintel.project.domain.Scores;
@Repository
public interface ScoresJPA extends JpaRepository<Scores, Integer>{
	@Query("select a.examId from Scores a where studentId=?1")
	 List<Integer> getAttemptedExamsListByStudent(String id);
	@Query("select a.mark from Scores a where studentId=?1 and examId=?2")
	Integer getScore(String id,Integer examid);
}
