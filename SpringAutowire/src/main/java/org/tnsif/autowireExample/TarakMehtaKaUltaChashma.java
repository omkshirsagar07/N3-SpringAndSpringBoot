package org.tnsif.autowireExample;

public class TarakMehtaKaUltaChashma {
	
	//DI in the form of object
	
	Jethalal j = new Jethalal();

	

	public void setJ(Jethalal j) {
		this.j = j;
	}
	
	
	//DI using constructor

	public TarakMehtaKaUltaChashma(Jethalal j) {
		super();
		this.j = j;
	}
			
	
	
	
	
	//inject the object of jethalal
	public void JaiJinendra()
	{
		j.gadaElectronics();
	}


	
}
