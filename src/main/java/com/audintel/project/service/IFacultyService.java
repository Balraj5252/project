package com.audintel.project.service;

import java.util.List;

import com.audintel.project.domain.Faculty;

public interface IFacultyService {
	public List<Faculty> getAllFaculty();
	public String addFaculty(Faculty f);
	public Faculty getFacultyById(String id);
	public void deleteFaculty(String id);
}
