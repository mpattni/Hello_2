package com.buildingd.pg.spring;

public class Address {

	private String street;
	private String zipCode;
	
	/*
	 * 
	 */
	public Address(String street, String zipCode) {
		super();
		this.street = street;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", zipCode=" + zipCode + "]";
	}
	
	
	
}
