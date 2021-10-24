package com.comaymanagement.cmd.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "departments_employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentEmployee {
	private Integer departmentId;
	private Integer employeeId;
}
