package com.comaymanagement.cmd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comaymanagement.cmd.entity.Employee;
import com.comaymanagement.cmd.repository.IEmployeesRepository;

@Service
public class EmployeesService implements IGeneralService<Employee> {
	
	@Autowired
	IEmployeesRepository employeesRepository;

	@Override
	public Optional<Employee> findById(Long id) {
		return employeesRepository.findById(id);
	}

	@Override
	public void remove(Employee employees) {
		employeesRepository.delete(employees);
	}
	@Override
	public Employee save(Employee employees) {
		return employeesRepository.save(employees);
	}

	@Override
	public Iterable<Employee> findAll() {
		
		return employeesRepository.findAll();
	}
	public List<Employee> findByActiveFlag(Boolean flag){
		return employeesRepository.findByActiveFlag(flag);
	}
}
