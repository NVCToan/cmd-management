package com.comaymanagement.cmd.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comaymanagement.cmd.entity.Employee;
import com.comaymanagement.cmd.entity.Position;
import com.comaymanagement.cmd.service.EmployeesService;

@RestController
@RequestMapping("/employees")
public class EmployeesAPI {
//	 private final Logger logger = LoggerFactory.getLogger(this.getClass()); => Xong goi method ra
	@Autowired
	EmployeesService employeesService;
	
	// Create url find all employees
	@GetMapping(path = "", produces = "application/json")
	public List<Employee> FindAll(){
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
	
	
	// Example return ResponseEntity
	
//	@GetMapping("/{id}")
//	public ResponseEntity<Object> findById(@PathVariable Long id) {
//		Optional<Produce> produce = produceRepository.findById(id);
//		
//		if (produce.isPresent()) {
//			return ResponseEntity.status(HttpStatus.OK).body(
//					new ResponseObject("OK","Query produce successfully: ", produce)
//			);
//		}else {
//			
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
//				new ResponseObject("Not found","Produce not found with id: " + id,"")	
//			);
//		}
//		
//	}
	
//	@PutMapping("/update/{id}")
//	public ResponseEntity<ResponseObject> updateProduce(@RequestBody Produce produceUpdate,@PathVariable Long id) {
//		Optional<Produce>  updateProduce = produceRepository.findById(id);
//		if(updateProduce.isPresent()) {
//			updateProduce.map(produce -> {
//			
//					produce.setProduceName(produceUpdate.getProduceName());
//					produce.setYear(produceUpdate.getYear());
//					produce.setPrice(produceUpdate.getPrice());
//					return produceRepository.save(produce);
//
//				});
//
//			return ResponseEntity.status(HttpStatus.OK).body(
//					new ResponseObject("OK","Edited!", "")
//					);
//		}else {
//			return ResponseEntity.status(HttpStatus.OK).body(
//					new ResponseObject("Not Exists","Produce not exists", "")
//					);
//		}
//		
//					
//		
//	}
}
