package com.Brian;

public class Product {
	private int id;
	
	public Product(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id; 
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			Product other = (Product) obj;
			
			if (this.id == other.getId()) {
				return true;
			}
		}
		
		return false; 
	}
}
