package com.comaymanagement.cmd.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comaymanagement.cmd.entity.Employee;
import com.comaymanagement.cmd.entity.Position;
import com.comaymanagement.cmd.service.EmployeesService;

@RestController
@RequestMapping("/employees")
public class EmployeesAPI {
	
	@Autowired
	EmployeesService employeesService;
	
	// Create url find all employees
	@GetMapping(path = "", produces = "application/json")
	public List<Employee> FindAll(){
<<<<<<< HEAD
		for(Employee employee : employeesService.findAll()) {
			for(Position position : employee.getPositionList()) {
				System.out.println(position.getName());
			}
		}
=======
		
>>>>>>> 68f3609cb749d9d20a580fa934ecab1c4bcbbbc6
		return employeesService.findAll();
	}
	
	// Create url find employees by id
	@GetMapping("/{id}")
	public Optional<Employee> FindByID(@PathVariable Long id) {

		return employeesService.findById(id);
	}
	@GetMapping("/flag/{f}")
	public List<Employee> FindByActiveFlag(@PathVariable Boolean f) {
		return employeesService.findByActiveFlag(f);
	}
	
	
	
}
