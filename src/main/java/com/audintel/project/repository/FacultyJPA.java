package com.audintel.project.repository;


import com.audintel.project.domain.Faculty;
import org.springframework.data.repository.CrudRepository;

public interface FacultyJPA extends CrudRepository<Faculty, String>,FacultyDAO{

}
