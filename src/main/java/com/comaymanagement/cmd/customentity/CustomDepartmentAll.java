package com.comaymanagement.cmd.customentity;

import java.util.Set;

import com.comaymanagement.cmd.entity.Position;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomDepartmentAll {
	private Integer id;
	
	private String name;
	private Integer fatherDepartmentId;
	private Integer managerId;
	
	private Set<Position> positionList;
	
}
