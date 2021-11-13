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
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="tasks")
public class Task {  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="status_id",insertable=false, updatable=false)
	private Integer statusId;
	@Column(name="creator_id",insertable=false, updatable=false)
	private Integer creatorId;
	
	@OneToOne()
	@JoinColumn(name="creator_id")
	private Employee employee;
	
	@OneToMany
	@JoinColumn(name="task_id")
	@JsonBackReference
	private Set<TaskDetail> taskDetailList;
	
	@OneToOne()
	@JoinColumn(name="status_id")
	private Status status;
}
