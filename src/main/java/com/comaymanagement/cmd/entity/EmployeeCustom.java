package com.comaymanagement.cmd.entity;

import java.util.Optional;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeCustom {

	private Long id;
	private String name;
	private String dateOfBirth;
	private String email;
	
	private String phoneNumber;
	private Set<String> departmentName;
	private Set<String> positionName;
}
