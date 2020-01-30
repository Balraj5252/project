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
import com.audintel.project.domain.Faculty;
import com.audintel.project.service.ExamsService;
import com.audintel.project.service.IFacultyService;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
	@Autowired
	IFacultyService fs ;
	@Autowired
	ExamsService es ;
	
	@GetMapping("/getall")
	public ResponseEntity getAllFaculty() {
		try {
			System.out.println("Help");
			List<Faculty> lf = fs.getAllFaculty();
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
	public ResponseEntity insertFaculty(@RequestBody Faculty q) {
		try {
			
			return new ResponseEntity(fs.addFaculty(q),HttpStatus.OK);
		}  
		catch (Exception e) 
		{ 
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND); 
		} 
	}
	@DeleteMapping("/Question/{id}")
	public ResponseEntity deleteFaculty(@PathVariable(value="id") String id ) {
		try {
			//questionJPA.deleteById(id);
			fs.deleteFaculty(id);
			if(fs.getFacultyById(id)==null){
			return new ResponseEntity(" Deleted ",HttpStatus.OK);}
			else{
				return new ResponseEntity(" Not Deleted ",HttpStatus.OK);
			}
		}  
		catch (Exception e) 
		{ 
			return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND); 
		} 
	}
	@GetMapping("/getone/{id}")
	public ResponseEntity getoneFacultyById(@PathVariable(value = "id") String id) {
		try {
			System.out.println("Help");
			Faculty lf = fs.getFacultyById(id);
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
	
	@GetMapping("/verifyfaculty/{id}")
	public ResponseEntity verifyFacultyById(@PathVariable(value = "id")String id){
		try{
		Faculty lf = fs.getFacultyById(id);
		if(lf != null){	
		return new ResponseEntity(lf,HttpStatus.OK);}
		else{
			return new ResponseEntity("not Found", HttpStatus.BAD_REQUEST);
		}
	}  catch (Exception e) { 
		//e.printStackTrace();
		return new ResponseEntity(e.getMessage(), HttpStatus.BAD_GATEWAY); 
	} 
	}
	
	@PostMapping("/prepareexam/{id}")
	public ResponseEntity prepareQuestionPaper(@PathVariable(value = "id") String id,@RequestBody Exam ex){
		ex.setFacultyId(id);
		es.addExam(ex);
		return new ResponseEntity("Done",HttpStatus.OK);
		
	}
	
}
