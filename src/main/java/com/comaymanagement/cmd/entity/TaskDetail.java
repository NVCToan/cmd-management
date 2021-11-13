package com.comaymanagement.cmd.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "task_details")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TaskDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	private String description;
	private String createBy;
	private String modifyBy;
	private String createDate;
	private String modifyDate;
	
	@OneToOne()
	@JoinColumn
	private Task task;
	
	@OneToOne()
	@JoinColumn(name="receiver_id",insertable=false, updatable=false)
	private Employee employee;
	
	
}
