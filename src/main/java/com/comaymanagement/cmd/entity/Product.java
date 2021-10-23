package com.comaymanagement.cmd.entity;

public class Product {
	private int ID;
	private String productName;
	
	public Product(int iD, String productName) {
		super();
		ID = iD;
		this.productName = productName;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	

}
