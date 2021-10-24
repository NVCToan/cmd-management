package com.comaymanagement.cmd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "positions_has_enployees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PositionEmployee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String name;
	private Integer departmentId;
	private Boolean isManager;
	private String createBy;
	private String createDate;
	private String modifyBy;
	private String modifyDate;
	
	
}
