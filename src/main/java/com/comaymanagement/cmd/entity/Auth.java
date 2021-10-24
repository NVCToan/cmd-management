package com.comaymanagement.cmd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "auth")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Auth {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer roleId;
	private Integer menuId;
	private Boolean permission;
	private Boolean activeFlag;
	private String createDate;
	private String updateDate;
}
