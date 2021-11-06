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

@Entity(name = "auth")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Auth {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="role_id",insertable=false, updatable=false)
	private Integer roleId;
	@Column(name="menu_id",insertable=false, updatable=false)
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
