package org.tnsif.objectsInjection;

public class cellPhone {
	charger c;
	sim s;
	public charger getC() {
		return c;
	}
	public void setC(charger c) {
		this.c = c;
	}
	public sim getS() {
		return s;
	}
	public void setS(sim s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "cellPhone [c=" + c + ", s=" + s + "]";
	}
	
	
}
