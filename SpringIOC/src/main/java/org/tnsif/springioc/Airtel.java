package org.tnsif.springioc;

public class Airtel implements Sim{

	public void call() {
		System.out.println("Calling using airtel");
	}

	public void message() {
		System.out.println("6G is coming soon...");
	}

}
