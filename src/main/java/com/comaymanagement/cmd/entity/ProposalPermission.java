package com.comaymanagement.cmd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "proposal_permissions")
public class ProposalPermission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="proposal_type_id",insertable=false, updatable=false)
	private Integer proposalTypeId;
	@Column(name="department_id",insertable=false, updatable=false)
	private Integer departmentId;
	@Column(name="position_id",insertable=false, updatable=false)
	private Integer positionId;
	@Column(name="employee_id",insertable=false, updatable=false)
	private Integer employees;
	
	@OneToOne()
	@JoinColumn(name="position_id")
	private Position position;
	
	
	@OneToOne()
	@JoinColumn(name="department_id")
	private Department department;
	
	@OneToOne()
	@JoinColumn(name="employee_id")
	private Employee employee;
	
	@OneToOne()
	@JoinColumn(name="proposal_type_id")
	private ProposalType proposalType;
}
