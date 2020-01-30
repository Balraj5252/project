package com.audintel.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.audintel.project.domain.Faculty;
import com.audintel.project.repository.FacultyJPA;

@Service
public class FacultyService implements IFacultyService{
	
	
	@Autowired
	FacultyJPA fj;
	
	public List<Faculty> getAllFaculty(){
		try{
			
			return  fj.findAll();
		}catch(Exception e){
			throw e;
		}
		//return null;
	}
	
	public String addFaculty(Faculty f){
		Faculty fs =  fj.save(f);
		return fs.toString();
	}
	
	public Faculty getFacultyById(String id){
		return fj.findById(id).get();
	}
	
	public void deleteFaculty(String id){
	     fj.deleteById(id);
	}
}
