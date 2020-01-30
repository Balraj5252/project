package com.audintel.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.audintel.project.domain.Scores;
import com.audintel.project.repository.ScoresJPA;

@Service
@Transactional
public class ScoresService {
	@Autowired
	ScoresJPA sj;
	
	public Scores addScore(Scores s){
		return sj.save(s);
	}
	public List<Scores> getAllScores(){
		return sj.findAll();
	}
	public List<Integer> getExamsAttemptedbyStudent(String id){
		return sj.getAttemptedExamsListByStudent(id);
	}
	public Integer getScores(Integer examid,String studentid){
		return sj.getScore(studentid, examid);
	}
}
