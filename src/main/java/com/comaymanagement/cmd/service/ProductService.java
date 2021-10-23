package com.comaymanagement.cmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comaymanagement.cmd.entity.Product;
import com.comaymanagement.cmd.repository.ProductRepositoty;

@Service
public class ProductService {

	@Autowired
	ProductRepositoty productRepositoty;
	public List<Product> findAll(){
		return productRepositoty.findAll();
	}
}
