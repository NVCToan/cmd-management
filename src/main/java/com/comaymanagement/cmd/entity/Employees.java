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
	private long id;
	private String name;
	private String date_of_birth;
	private String email;
	private String phone_number;
	
	private Long manager_id;
	private String create_by;
	private String modify_by;
	private String create_date;
	private String modify_date;
}
