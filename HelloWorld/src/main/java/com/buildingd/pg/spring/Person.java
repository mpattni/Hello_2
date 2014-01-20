package com.buildingd.pg.spring;

public class Person {

	int id;
	String name;
	private int taxId;
	
	Address address;
	
	
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String speak() {
		return "Hello World!";
	}
	
	

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
				+ ", address=" + address + "]";
	}


	
	
	
}
