package com.comaymanagement.cmd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employees {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String dateOfBirth;
	private String email;
	private String phoneNumber;
	
	private boolean activeFlag;
	private Long managerId;
	private String createBy;
	private String modifyBy;
	private String createDate;
	private String modifyDate;
}
