package com.comaymanagement.cmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comaymanagement.cmd.entity.Department;
import com.comaymanagement.cmd.repository.IDepartmentHasEmployee;
@Service
public class DepartmentHasEmployeeService{
	@Autowired
	IDepartmentHasEmployee departmentHasEmployeeRepository;
	public List<Department> findAllDepartmentByEmployeeId( Long id){
		return departmentHasEmployeeRepository.findAllDepartmentByEmployeeId(id);
	}

	
}
