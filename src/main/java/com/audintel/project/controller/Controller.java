package com.audintel.project.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.audintel.project.domain.Question;
import com.audintel.project.domain.Scores;
import com.audintel.project.service.ScoresService;

@RestController
@RequestMapping("/test")
public class Controller {
	@Autowired
	ScoresService ss;
	@GetMapping("/questions")
	public ResponseEntity getAllQuestions() {
		try {
			System.out.println("Help");
			return new ResponseEntity("you got it ",HttpStatus.OK);
		}  catch (Exception e) { 
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND); 
		} 
	}
	@PostMapping("/Question")
	public ResponseEntity insertQuestion(@RequestBody Question q) {
		try {
			System.out.println(q);
			//qs.addQuestion(q);
			System.out.println(q);
			return new ResponseEntity("done",HttpStatus.OK);
		}  
		catch (Exception e) 
		{ 
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND); 
		} 
	}
	@DeleteMapping("/Question/{id}")
	public ResponseEntity deleteQuestion(@PathVariable(value="id") Integer id ) {
		try {
			//qs.delete(id);
			return new ResponseEntity(null,HttpStatus.OK);
		}  
		catch (Exception e) 
		{ 
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND); 
		} 
	}
	@PostMapping("/update")
	public ResponseEntity updateQuestion(@RequestBody Question q) {
		try {
			return new ResponseEntity("done",HttpStatus.OK);
		}  
		catch (Exception e) 
		{ 
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND); 
		} 
	}
	@GetMapping("/question/{id}")
	public ResponseEntity getOneQuestions(@PathVariable(value = "id") Integer id) {
		try {
			//System.out.println("Help");
			//qs.getQuestion(id);
			return new ResponseEntity(null,HttpStatus.OK);
		}  catch (Exception e) { 
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND); 
		} 
	}
	@GetMapping("/questionsub/{sub}")
	public ResponseEntity getallQuestionsBySub(@PathVariable(value = "sub") String sub) {
		try {
			
			return new ResponseEntity(null,HttpStatus.OK);
		}  catch (Exception e) { 
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND); 
		} 
	}
	public Boolean validate(Integer id, String ans){
		return false;
	}
	
	@PostMapping("/validate/{id}/{examid}")
	public ResponseEntity validateStudentPaper(@PathVariable(value="id")String id,@PathVariable(value= "examid")Integer examid,@RequestBody Map<Integer,String> m){
		try {
			Integer x=0;
			for (Map.Entry<Integer, String> entry : m.entrySet()) {
				if(validate(entry.getKey(),entry.getValue())){
					x++;
				}
			}
			Scores s = new Scores();
			s.setExamId(examid);
			s.setStudentId(id);
			s.setMark(x);
			ss.addScore(s);
			return new ResponseEntity("validated",HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
}
