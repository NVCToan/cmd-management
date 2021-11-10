package com.comaymanagement.cmd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.comaymanagement.cmd.entity.Employee;

public interface IEmployeesRepository extends JpaRepository<Employee, Long> {
	
	public List<Employee> findByActiveFlag(Boolean activeFlag);
	

	
}
