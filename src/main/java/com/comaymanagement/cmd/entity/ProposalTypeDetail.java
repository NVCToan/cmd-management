package com.comaymanagement.cmd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private Integer proposalTypeId;
	private Integer fieldId;
	private String fieldName;
	private Integer dataTypeId;
	private String createBy;
	private String modifyBy;
	private String createDate;
	private String modifyDate;
}
