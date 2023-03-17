package org.tnsif.usingautowireanotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Remote {
	
	private Cell cell;

	
	//DI using setters

	@Autowired
	//@Qualifier("c1")
	
	@Qualifier("c2")//to execute pertucular bean from multiple
	
	/*ton achieve autowire using setters ,use @autowire annotation */
	public void setCell(Cell cell) {
		this.cell = cell;
	}
	
																							
	//public constructor
	public Remote()
	{
		System.out.println("Default constructor for remote");
	}
	
	
	public void remote()
	{
		cell.power();
	}
}
