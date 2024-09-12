package com.audintel.project.controller;

import java.util.List;
import java.util.Map;

import com.audintel.project.service.ControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.audintel.project.domain.Question;
import com.audintel.project.domain.Scores;
import com.audintel.project.service.ScoresService;

@RestController
@RequestMapping("/test")
@CrossOrigin(origins="http://localhost:3000")
public class Controller {


	@Autowired
	ControllerService cs;
	@GetMapping(("/anagrams/{id}"))
	public ResponseEntity getAllQuestions(@PathVariable(value="id") String id ) {
		try {
			System.out.println("Help : " + id);
			List<String> stringList =  cs.getAnagrams(id);
			return new ResponseEntity(stringList,HttpStatus.OK);
		}  catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity("error in try block", HttpStatus.INTERNAL_SERVER_ERROR);
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
	
}
