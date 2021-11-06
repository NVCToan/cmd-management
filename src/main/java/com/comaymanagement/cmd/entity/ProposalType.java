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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "proposal_types")
public class ProposalType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	@OneToMany
	@JoinColumn(name="proposal_type_id")
	private Set<ProposalDetail> proposalDetailList;
	
	@OneToMany
	@JoinColumn(name="proposal_type_id")
	private Set<ProposalPermission> proposalPermissionList;
	
	@OneToMany
	@JoinColumn(name="proposal_type_id")
	private Set<Proposal> proposalList;
	
	@OneToMany
	@JoinColumn(name="proposal_type_id")
	private Set<ApprovalStep> approvalStepList;
	
}
