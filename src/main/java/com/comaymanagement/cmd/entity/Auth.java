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
	
	@OneToOne()
	@JoinColumn(name="menu_id")
	private Menu menu;
	
	@OneToOne()
	@JoinColumn(name="role_id")
	private Role role;
}
