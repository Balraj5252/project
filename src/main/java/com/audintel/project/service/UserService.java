package com.audintel.project.service;

import com.audintel.project.domain.Exam;
import com.audintel.project.domain.user;
import com.audintel.project.repository.ExamJPA;
import com.opencsv.CSVReader;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

	public List<user> getAllUsers() throws IOException {
		List<user> userList = new ArrayList<>();
		CSVReader csvReader = new CSVReader(new FileReader("/Users/balrazhanmanthugari/Downloads/usual/projects/test-project/src/main/resources/files/users.csv"));
		List<String[]> allData = csvReader.readAll().subList(0,100);
		for (String[] row : allData) {
			user user = new user();
			user.setId(Integer.valueOf(row[0]));
			user.setFirstName(row[1]);
			user.setLastName(row[2]);
			user.setEmail(row[3]);
			user.setGender(row[4]);
			user.setPhone(row[5]);
			System.out.println(user);
			userList.add(user);
		}
		return userList;
	}
	
}
