package com.audintel.project.controller;
import com.audintel.project.domain.user;
import com.audintel.project.service.ScoresService;
import com.audintel.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService us;
	@GetMapping("/all")
	public ResponseEntity<List<user>> getAllQuestions() {
		try {
			List<user> userList;
			userList = us.getAllUsers();
			return new ResponseEntity(userList,HttpStatus.OK);
		}  catch (Exception e) { 
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		} 
	}
}
