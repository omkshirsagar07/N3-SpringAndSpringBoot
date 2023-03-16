package org.tnsif.literals;

public class BalenoEngine implements IEngine {
	
	
	private String company ;
	private double cost;
	public double cost() {
		// TODO Auto-generated method stub
		return cost;
	}
	public String display() {
		// TODO Auto-generated method stub
		return "Suzuki";
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return " Origine of BalenoEngine company=" + company  + fuel;
	}
	
	public BalenoEngine(String company, double cost) {
		super();
		this.company = company;
		this.cost = cost;
	}
	
	
}
