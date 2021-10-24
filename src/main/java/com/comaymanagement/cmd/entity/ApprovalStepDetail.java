package com.comaymanagement.cmd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
}