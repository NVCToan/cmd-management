package com.comaymanagement.cmd.entity;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private Integer approvalStepId;
	private Integer employeeId;
	private Integer departmentId;
	private Integer positionId;
	
	@OneToOne()
	@JoinColumn(name="approval_step_id")
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
