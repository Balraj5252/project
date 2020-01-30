package com.audintel.project.controller;

import java.util.List;

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

import com.audintel.project.domain.Exam;
import com.audintel.project.service.ExamsService;

@RestController
@RequestMapping("/exam")
public class ExamController {
	@Autowired
	ExamsService es ;
	
	@GetMapping("/getall")
	public ResponseEntity getAllQuestions() {
		try {
			System.out.println("Help");
			List<Exam> lf = es.getAllExam();
			if(lf != null){
			return new ResponseEntity(lf,HttpStatus.OK);}
			else{
				return new ResponseEntity("not Found", HttpStatus.BAD_REQUEST);
			}
		}  catch (Exception e) { 
			e.printStackTrace();
			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_GATEWAY); 
		} 
	}
	@PostMapping("/add")
	public ResponseEntity insertQuestion(@RequestBody Exam ex) {
		try {
			System.out.println(ex.getQuestions());
			
			return new ResponseEntity(es.addExam(ex),HttpStatus.OK);
		}  
		catch (Exception e) 
		{ 
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND); 
		} 
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity deleteQuestion(@PathVariable(value="id") String id ) {
		try {
			es.deleteExam(id);
			if(es.getExam(id)!=null){
			return new ResponseEntity(" Deletion Failed",HttpStatus.OK);}
			else{
				return new ResponseEntity("Deleted",HttpStatus.OK);
			}
		}  
		catch (Exception e) 
		{ 
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND); 
		} 
	}
	@GetMapping("/getone/{id}")
	public ResponseEntity getOneQuestions(@PathVariable(value ="id") String id) {
		try {
			//System.out.println("Help");
			Exam lf = es.getExam(id);
			if(lf != null){
			return new ResponseEntity(lf,HttpStatus.OK);}
			else{
				return new ResponseEntity("not Found", HttpStatus.BAD_REQUEST);
			}
		}  catch (Exception e) { 
			e.printStackTrace();
			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_GATEWAY); 
		} 
	}
	@GetMapping("/getallBysem/{sem}")
	public ResponseEntity getOneQuestions(@PathVariable(value ="sem") Integer sem) {
		try {
			//System.out.println("Help");
			// lf = es.getExam(id);
			//if(lf != null){
			return new ResponseEntity(es.getAllExamBySem(sem),HttpStatus.OK);
//			else{
//				return new ResponseEntity("not Found", HttpStatus.BAD_REQUEST);
//			}
		}  catch (Exception e) { 
			e.printStackTrace();
			return new ResponseEntity(e.getMessage(), HttpStatus.BAD_GATEWAY); 
		} 
	}
	
}
