package com.comaymanagement.cmd.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "positions")
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Position {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	@Column(name="department_id")
	private Integer departmentId;
	private Boolean isManager;
	private String createBy;
	private String createDate;
	private String modifyBy;
	private String modifyDate;
	
	@OneToMany
	@JoinColumn(name="position_id")
	@JsonBackReference
	private Set<Role> roleList;
	
	@OneToOne()
	@JoinColumn(name="department_id",insertable=false, updatable=false)
	private Department department;
	
	@ManyToMany()
	@JoinTable(name = "positions_has_employees",
	joinColumns = {@JoinColumn(name = "position_id", referencedColumnName = "id")},
	inverseJoinColumns = {@JoinColumn(name = "employee_id", referencedColumnName = "id")})
	@JsonBackReference
	private Set<Employee> employeeList;
	
	@OneToMany
	@JoinColumn(name="position_id")
	@JsonBackReference
	private Set<ApprovalStepDetail> approvalStepDetailList;
	
	@OneToMany
	@JoinColumn(name="position_id")
	@JsonBackReference
	private Set<ProposalPermission> proposalPermissionList;


	
	
	
}
