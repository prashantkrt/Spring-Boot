package com.example.demo;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBoot03Application {

	static {
		System.out.println("Demo Application is loaded");
	}

	public SpringBoot03Application() {
		System.out.println("Demo application bean is created");
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBoot03Application.class, args);

		// AnnotationConfigApplicationContext used for non xml approach in spring
		System.out.println("Spring container used here " + context.getClass().getName());
		// number of beans getting created by Spring boot behind the scene 
		System.out.println("Number of beans getting created behind the scene "+context.getBeanDefinitionCount());
        // number of beans name which are getting created
		System.out.println("Beans names which are getting created automatically "+context.getBeanDefinitionNames().length);
		
		// all the names
		System.out.println("Beans names which are getting created automatically "+Arrays.toString(context.getBeanDefinitionNames()));
		
		//both will work :)
		//((ConfigurableApplicationContext) context).close();
		((AnnotationConfigApplicationContext)context).close();
	}
}
