package com.comaymanagement.cmd.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comaymanagement.cmd.entity.Department;
import com.comaymanagement.cmd.repository.IDepartmentRepository;
@Service
public class DepartmentService implements IGeneralService<Department> {

	@Autowired
	IDepartmentRepository departmentRepository;
	@Override
	public Iterable<Department> findAll() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}



	@Override
	public Department save(Department t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Department model) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Optional<Department> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}






}
