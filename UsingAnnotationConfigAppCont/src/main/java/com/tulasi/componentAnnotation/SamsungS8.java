package com.tulasi.componentAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*@Component annotation is used to create a bean automatically with 
non-qualified de-capitalised class name. In this eg, it is "samsungS8"*/


@Component 
@Primary
public class SamsungS8 implements Samsung {
	@Autowired	//We have two beans of type CPU i.e, "mediaTek", "snapDragon". Hence we must use @Qualifier annotation to specify the bean
	@Qualifier("snapDragon")
	CPU processor;
	public void config() {
		System.out.println("8gb RAM, 128gb ROM");
		processor.brand();
	}

}
