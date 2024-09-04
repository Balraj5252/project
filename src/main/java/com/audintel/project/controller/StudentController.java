package com.audintel.project.controller;

import java.util.ArrayList;
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
import com.audintel.project.domain.Student;
import com.audintel.project.service.ExamsService;
import com.audintel.project.service.ScoresService;
import com.audintel.project.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService ss ;
	@Autowired
	ExamsService es;
	@Autowired
	ScoresService scores;
	@GetMapping("/getall")
	public ResponseEntity getAllStudents() {
		try {
			System.out.println("Help");
			List<Student> lf = new ArrayList<>();
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
	public ResponseEntity insertStudent(@RequestBody Student q) {
		try {
			
			return new ResponseEntity(ss.addStudent(q),HttpStatus.OK);
		}  
		catch (Exception e) 
		{ 
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND); 
		} 
	}
	@DeleteMapping("/Question/{id}")
	public ResponseEntity deleteStudent(@PathVariable(value="id") Integer id ) {
		try {
			//questionJPA.deleteById(id);
			return new ResponseEntity("  ",HttpStatus.OK);
		}  
		catch (Exception e) 
		{ 
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND); 
		} 
	}
	
	@GetMapping("/verify/{id}")
	public ResponseEntity verifyStudent(@PathVariable String id){
		Integer sem  = ss.verifyStudent(id);
		if(sem!=null){
			
			List<Exam> l = es.getAllExamBySem(sem);
			List<Exam> la = new ArrayList<Exam>();
			List<Integer> li = scores.getExamsAttemptedbyStudent(id);
			for(Exam e :l ){
				if(li.contains(e.getId())){
					la.add(e);
				}
			}
 			
			return new ResponseEntity(la,HttpStatus.FOUND);
		}
		else{
			return new ResponseEntity("Failed",HttpStatus.NOT_FOUND);
		}
	}
	
	
	@GetMapping("/notattempted/{id}")
	public ResponseEntity notAttemptedExams(@PathVariable(value = "id")String id){
		try {
			Integer sem  = ss.verifyStudent(id);
			List<Exam> l = es.getAllExamBySem(sem);
			List<Exam> na = new ArrayList<Exam>();
			List<Integer> li = scores.getExamsAttemptedbyStudent(id);
			for(Exam e :l ){
				if(!(li.contains(e.getId()))){
					na.add(e);
				}
			}
				
			return new ResponseEntity(na,HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity(e.getMessage(),HttpStatus.OK);

		}
	}
	@PostMapping("/examvalidate/{id}")
	public ResponseEntity examValidate(@PathVariable(value="id") String id,@RequestBody Exam e){
		try {
			List<Integer> li = scores.getExamsAttemptedbyStudent(id);
			if(li.contains(e.getId())){
				return new ResponseEntity("your alreadya attempedted this exam and your score is "+scores.getScores(e.getId(), id),HttpStatus.OK);
			}
			else{
				return  new ResponseEntity(e,HttpStatus.OK);
			}
			
		} catch (Exception e2) {
			return new ResponseEntity(e2.getMessage(),HttpStatus.BAD_REQUEST);
			
		}
	}
}
