package com.comaymanagement.cmd.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "proposals")
public class Proposal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="proposal_type_id",insertable=false, updatable=false)
	private Integer proposalTypeId;
	@Column(name="creator_id",insertable=false, updatable=false)
	private Integer creatorId;
	@Column(name="status_id",insertable=false, updatable=false)
	private Integer statusId;
	
	@OneToMany
	@JoinColumn(name="proposal_id")
	@JsonBackReference
	private Set<ProposalDetail> proposalDetailList;
	
	@OneToOne()
	@JoinColumn(name="creator_id")
	private Employee employee;
	
	@OneToOne()
	@JoinColumn(name="status_id")
	private Status status;
	
	@OneToOne()
	@JoinColumn(name="proposal_type_id")
	private ProposalType proposalType;
}
