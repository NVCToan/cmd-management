package com.comaymanagement.cmd.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.comaymanagement.cmd.entity.Product;

@Repository
public class ProductRepositoty  {
	static List<Product> listProducts = new ArrayList<Product>();
	
	public List<Product> findAll(){
		Product product = new Product(1, "product A");
		Product product1 = new Product(2, "product B");
		Product product2= new Product(3, "product C");
		Product product3 = new Product(4, "product D");
		Product product4 = new Product(5, "product E");
		listProducts.add(product);
		listProducts.add(product1);
		listProducts.add(product2);
		listProducts.add(product3);
		listProducts.add(product4);
		return listProducts;
		
	}
}
