package org.tnsif.usingautowireanotation;

public class Cell {

	

	//private data members
	private String company;
	private String size;
	
	//getter and setter
	
	public void setCompany(String company) {
		this.company = company;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	
	
	
	public Cell() {
		super();
		System.out.println("Default constructor for cell");
	}
	
	public void power()
	{
		System.out.println("company of a cell: "+company);
		System.out.println("Size of a cell: "+size);
	}
	
	
	
}
