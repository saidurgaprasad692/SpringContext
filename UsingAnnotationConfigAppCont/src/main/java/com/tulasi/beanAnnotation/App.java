package com.tulasi.beanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);
    	/*ApplicationContext always matches with the type of bean in the Configuration class before creating. 
    	If there are multiple beans with same type, it will then match with the name(id) of the bean which is unique*/
    	/*Here in this example, we have only one bean of type Samsung in AppConfig.class i.e "samsung",
    	hence it creates "samsung" bean and assigns it to "phone"*/
    	Samsung phone=factory.getBean(Samsung.class);
    	phone.config();
    	((ConfigurableApplicationContext)factory).close();
    }
}
