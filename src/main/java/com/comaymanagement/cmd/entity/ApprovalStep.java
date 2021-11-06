package com.comaymanagement.cmd.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "approval_steps")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApprovalStep {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private String approvalStepName;
	private Integer approvalStepIndex;
	private Integer proposalStyleId;
	
	@OneToOne()
	@JoinColumn(name="proposal_type_id")
	private ProposalType proposalType;
	
	@OneToMany
	@JoinColumn(name="approval_step_id")
	private Set<ApprovalStepDetail> approvalStepDetailList;
}
