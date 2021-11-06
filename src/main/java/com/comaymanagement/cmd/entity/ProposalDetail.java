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
@Entity(name = "proposal_details")
public class ProposalDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	//@Column(name="proposal_id")
	@Column(name="proposal_id",columnDefinition="proposalId", insertable=false, updatable=false)
	private Integer proposalId;
	private String fieldId;
	private String content;
	private String createBy;
	private String modifyBy;
	private String createDate;
	private String modifyDate;
	
	@OneToOne()
	@JoinColumn(name="proposal_id")
	private Proposal proposal;
}
