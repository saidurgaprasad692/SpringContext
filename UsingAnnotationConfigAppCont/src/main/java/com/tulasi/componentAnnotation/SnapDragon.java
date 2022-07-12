package com.tulasi.componentAnnotation;

import org.springframework.stereotype.Component;

/*@Component annotation is used to create a bean automatically with 
non-qualified de-capitalised class name. In this eg, it is "snapDragon"*/


@Component 
public class SnapDragon implements CPU {

	public void brand() {
		System.out.println("SnapDragon");
	}

}
