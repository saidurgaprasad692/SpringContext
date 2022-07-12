package com.tulasi.beanAnnotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Samsung samsung() //bean with id "samsung"
	{
		return new SamsungS8();
	}
	
	@Bean
	public CPU mt() //bean with id "mt"
	{
		return new MediaTek();
	}
	
	@Bean
	public CPU sd() //bean with id "sd"
	{
		return new SnapDragon();
	}
}
