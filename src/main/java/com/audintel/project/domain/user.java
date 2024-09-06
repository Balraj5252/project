package com.audintel.project.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
@Data
public class user {
//id,first_name,last_name,email,gender,phone
	Integer id;
	String firstName;
	String lastName;
	String email;

	String gender;

	String phone;


}
