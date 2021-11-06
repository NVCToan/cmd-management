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
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="proposal_type_details")
public class ProposalTypeDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="proposal_type_id",insertable=false, updatable=false)
	private Integer proposalTypeId;
	private Integer fieldId;
	private String fieldName;
	@Column(name="data_type_id",insertable=false, updatable=false)
	private Integer dataTypeId;
	private String createBy;
	private String modifyBy;
	private String createDate;
	private String modifyDate;
	
	@OneToOne()
	@JoinColumn(name="proposal_type_id")
	private ProposalType proposalType;
	
	@OneToOne()
	@JoinColumn(name="data_type_id")
	private DataType dataType;
}
