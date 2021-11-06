package com.comaymanagement.cmd.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="statuses")
public class Status {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	@OneToMany
	@JoinColumn(name="status_id")
	@JsonBackReference
	private Set<Proposal> proposalList;
	
	@OneToMany
	@JoinColumn(name="status_id")
	@JsonBackReference
	private Set<Task> taskList;
}
