package com.audintel.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.audintel.project.domain.Faculty;

public interface FacultyJPA extends JpaRepository<Faculty, String>,FacultyDAO{

}
