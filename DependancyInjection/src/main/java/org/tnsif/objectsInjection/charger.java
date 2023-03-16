package org.tnsif.objectsInjection;

public class charger {
	private String Brand;
	private int volt;
	private String type;
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getVolt() {
		return volt;
	}
	public void setVolt(int volt) {
		this.volt = volt;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "charger [Brand=" + Brand + ", volt=" + volt + ", type=" + type + "]";
	}
	
	public void power()
	{
		System.out.println("Brand=" + Brand + ", volt=" + volt + " ,type=" + type);
	}
	
}
