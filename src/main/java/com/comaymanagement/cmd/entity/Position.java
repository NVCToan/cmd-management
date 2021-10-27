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
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "positions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Position {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	private Integer departmentId;
	private Boolean isManager;
	private String createBy;
	private String createDate;
	private String modifyBy;
	private String modifyDate;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="position_id")
	private Set<Role> roleList;
	
	@OneToOne()
	@JoinColumn(name="department_id")
	private Department department;
	
	@ManyToMany()
	@JoinTable(name = "positions_has_employees",
	joinColumns = {@JoinColumn(name = "id", referencedColumnName = "position_id")},
	inverseJoinColumns = {@JoinColumn(name = "id", referencedColumnName = "employee_id")})
	private Set<Employee> employeeList;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="position_id")
	private Set<ApprovalStepDetail> approvalStepDetailList;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="position_id")
	private Set<ProposalPermission> proposalPermissionList;
	
	
	
	
}
