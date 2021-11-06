package com.comaymanagement.cmd.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	@Column(name="position_id",insertable=false, updatable=false)
	private Integer positionId;
	
	@OneToMany
	@JoinColumn(name="role_id")
	private Set<Auth> authList;
	
	@OneToMany
	@JoinColumn(name="role_id")
	private Set<RoleDetail> roleDetailList ;
	
	@OneToOne()
	@JoinColumn(name="position_id")
	private Position position;
}
