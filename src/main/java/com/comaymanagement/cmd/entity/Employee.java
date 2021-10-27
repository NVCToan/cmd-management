package com.comaymanagement.cmd.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "employees")
public class Employee {
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
	
	@ManyToMany()
	@JoinTable(name = "positions_has_employees",
	joinColumns = {@JoinColumn(name = "id", referencedColumnName = "employee_id")},
	inverseJoinColumns = {@JoinColumn(name = "id", referencedColumnName = "position_id")})
	private Set<Position> positionList;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="employee_id")
	private Set<ProposalPermission> proposalPermissionList;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="creator_id")
	private Set<Task> taskList;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="receiver_id")
	private Set<TaskDetail> taskDetailList;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="creator_id")
	private Set<Proposal> proposalList;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="employee_id")
	private Set<ApprovalStepDetail> approvalStepDetailList ;
	
	
	@ManyToMany()
	@JoinTable(name = "departments_employees",
	joinColumns = {@JoinColumn(name = "id", referencedColumnName = "employee_id")},
	inverseJoinColumns = {@JoinColumn(name = "id", referencedColumnName = "department_id")})
	private Set<Department> departmentList;
	
	
	
}
