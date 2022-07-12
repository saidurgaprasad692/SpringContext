package com.tulasi.beanAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
 
public class SamsungS7 implements Samsung{
	@Autowired	//In AppConfig.class, we have two beans of type CPU i.e, "mt", "sd". Hence we must use @Qualifier annotation to specify the bean
	@Qualifier("mt")
	CPU processor;
	public void config() {
		System.out.println("6gb RAM, 64gb ROM");
		processor.brand();
	}
}
