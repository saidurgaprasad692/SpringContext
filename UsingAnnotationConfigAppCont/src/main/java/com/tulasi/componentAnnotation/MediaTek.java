package com.tulasi.componentAnnotation;

import org.springframework.stereotype.Component;

/*@Component annotation is used to create a bean automatically with 
non-qualified de-capitalised class name. In this eg, it is "mediaTek"*/


@Component 
public class MediaTek implements CPU {

	public void brand() {
		System.out.println("MediaTek");
	}

}
