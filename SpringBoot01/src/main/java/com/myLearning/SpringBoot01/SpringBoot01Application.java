package com.myLearning.SpringBoot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringBoot01Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBoot01Application.class, args);		
		
		Amazon amz =context.getBean(Amazon.class);
		boolean status = amz.initiateDelivery(9400.00);
		if(status)
		{
			System.out.println("order delivered");
		}
		else {
			System.out.println("Failed to deliver");
		}
	}

}
