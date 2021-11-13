package com.comaymanagement.cmd.entity;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomEmployeeAll {
	
	private Long id;
	private String name;
	private String dateOfBirth;
	private String email;
	private String phoneNumber;
	private Set<Position> positionList;
	private Set<Department> departmentList;
}
