package com.comaymanagement.cmd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.comaymanagement.cmd.entity.Employees;

@Repository
public interface IEmployeesRepository extends JpaRepository<Employees, Long> {
	
}
