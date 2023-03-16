package org.tnsif.objectsInjection;

public class cellPhone {
	charger c;
	
	//program to demonst trate the DI using object
	public charger getC() {
		return c;
	}

	public void setC(charger c) {
		this.c = c;
	}
	
	public void accept()
	{
		c.power();
	}
	
	
}
