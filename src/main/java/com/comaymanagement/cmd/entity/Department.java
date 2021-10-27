package com.comaymanagement.cmd.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

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
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="department_id")
	private Set<Position> positionList;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="department_id")
	private Set<ProposalPermission> proposalPermissionList;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="department_id")
	private Set<ApprovalStepDetail> approvalStepDetailList;
	

	@ManyToMany()
	@JoinTable(name = "departments_employees",
	joinColumns = {@JoinColumn(name = "id", referencedColumnName = "department_id")},
	inverseJoinColumns = {@JoinColumn(name = "id", referencedColumnName = "employee_id")})
	private Set<Employee> employeeList;
	
	
}
