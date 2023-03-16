package org.tnsif.objectsInjection;

public class sim {
	
	private String simtype;
	private String company;
	public String getSimtype() {
		return simtype;
	}
	public void setSimtype(String simtype) {
		this.simtype = simtype;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "sim [simtype=" + simtype + ", company=" + company + "]";
	}
	
	
	
}
