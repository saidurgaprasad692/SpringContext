package com.tulasi.componentAnnotation;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.tulasi.componentAnnotation") //ComponentScan specifies the package name from which the beans should be taken
public class AppConfig 
{
	
}
