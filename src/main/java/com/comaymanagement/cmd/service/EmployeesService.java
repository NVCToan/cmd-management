package com.comaymanagement.cmd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comaymanagement.cmd.entity.Employees;
import com.comaymanagement.cmd.repository.EmployeesRepository;

@Service
public class EmployeesService {
	
	@Autowired
	EmployeesRepository employeesRepository;
	
	public List<Employees> findAll() {
		return employeesRepository.findAll();
	}
	public Optional<Employees> FindByID(long id) {
		return employeesRepository.findById(id);
	}
}
