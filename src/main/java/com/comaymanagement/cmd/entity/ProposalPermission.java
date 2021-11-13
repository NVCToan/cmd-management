package com.comaymanagement.cmd.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "proposal_permissions")
public class ProposalPermission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
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
