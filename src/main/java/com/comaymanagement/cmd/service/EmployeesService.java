package com.comaymanagement.cmd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comaymanagement.cmd.entity.Employees;
import com.comaymanagement.cmd.repository.IEmployeesRepository;

@Service
public class EmployeesService implements IGeneralService<Employees> {
	
	@Autowired
	IEmployeesRepository employeesRepository;

	@Override
	public Optional<Employees> findById(Long id) {
		return employeesRepository.findById(id);
	}

	@Override
	public void remove(Employees employees) {
		employeesRepository.delete(employees);
	}
	@Override
	public Employees save(Employees employees) {
		return employeesRepository.save(employees);
	}

	@Override
	public Iterable<Employees> findAll() {
		
		return employeesRepository.findAll();
	}
	public List<Employees> findByActiveFlag(Boolean flag){
		return employeesRepository.findByActiveFlag(flag);
	}
}
