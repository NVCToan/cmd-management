package com.comaymanagement.cmd.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comaymanagement.cmd.entity.Employees;
import com.comaymanagement.cmd.service.EmployeesService;

@RestController
@RequestMapping("/employees")
public class EmployeesAPI {
	
	@Autowired
	EmployeesService employeesService;
	
	// Create url find all employees
	@GetMapping("")
	public List<Employees> FindAll(){
		return employeesService.findAll();
	}
	
	// Create url find employees by id
	@GetMapping("/{id}")
	public Optional<Employees> FindByID(@PathVariable Long id) {
		return employeesService.FindByID(id);
	}
}
