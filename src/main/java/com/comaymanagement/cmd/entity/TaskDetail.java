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

@Entity(name = "task_details")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TaskDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="receiver_id")
	private Integer receiverId;
	@Column(name="task_id")
	private Integer taskId;
	private String title;
	private String description;
	private String createBy;
	private String modifyBy;
	private String createDate;
	private String modifyDate;
	
	@OneToOne()
	@JoinColumn(name="task_id",insertable=false, updatable=false)
	private Task task;
	
	@OneToOne()
	@JoinColumn(name="receiver_id",insertable=false, updatable=false)
	private Employee employee;
	
	
}
