package com.comaymanagement.cmd.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	@ManyToMany
	@JoinTable(name = "positions_has_employees",
	joinColumns = {@JoinColumn(name = "employee_id", referencedColumnName = "id")},
	inverseJoinColumns = {@JoinColumn(name = "position_id", referencedColumnName = "id")})
	@JsonBackReference
	private Set<Position> positionList;
	
	@OneToMany
	@JoinColumn(name="employee_id")
	@JsonBackReference
	private Set<ProposalPermission> proposalPermissionList;
	
	@OneToMany
	@JoinColumn(name="creator_id")
	@JsonBackReference
	private Set<Task> taskList;
	
	@OneToMany
	@JoinColumn(name="receiver_id")
	@JsonBackReference
	private Set<TaskDetail> taskDetailList;
	
	@OneToMany
	@JoinColumn(name="creator_id")
	@JsonBackReference
	private Set<Proposal> proposalList;
	
	@OneToMany
	@JoinColumn(name="employee_id")
	@JsonBackReference
	private Set<ApprovalStepDetail> approvalStepDetailList ;
	
	
	@ManyToMany
	@JoinTable(name = "departments_employees",
	joinColumns = {@JoinColumn(name = "employee_id", referencedColumnName = "id")},
	inverseJoinColumns = {@JoinColumn(name = "department_id", referencedColumnName = "id")})
	@JsonBackReference
	private Set<Department> departmentList;

}
