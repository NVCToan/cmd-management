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

@Entity(name = "approval_step_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApprovalStepDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "approval_step_id")
	private Integer approvalStepId;
	
	@Column(name="employee_id",insertable=false, updatable=false)
	private Integer employeeId;
	
	@Column(name = "department_id",insertable=false, updatable=false)
	private Integer departmentId;
	@Column(name="postion_id",insertable=false, updatable=false)
	private Integer positionId;
	
	@OneToOne()
	@JoinColumn(name="approval_step_id",insertable=false, updatable=false)
	private ApprovalStep approvalStep;
	
	@OneToOne()
	@JoinColumn(name="department_id")
	private Department department;
	
	@OneToOne()
	@JoinColumn(name="postion_id")
	private Position position;
	
	@OneToOne()
	@JoinColumn(name="employee_id")
	private Employee employee;
}
