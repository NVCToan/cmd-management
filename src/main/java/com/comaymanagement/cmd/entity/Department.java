package com.comaymanagement.cmd.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "departments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

	private Integer id;
	private String name;
	private Integer fatherDepartmentId;
	private Integer managerId;
	private String createBy;
	private String createDate;
	private String modifyBy;
	private String modifyDate;
}
