package com.comaymanagement.cmd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comaymanagement.cmd.entity.Product;

import com.comaymanagement.cmd.service.ProductService;
import com.comaymanagement.cmd.service.UserService;

@RestController
@RequestMapping("/")
public class APIController {
	
	@Autowired
	UserService userService;
	@Autowired
	ProductService productService;
	
	// Create url find all products
	@GetMapping("products")
	public List<Product> FindAll(){
		return productService.findAll();
		
	}
	

}


