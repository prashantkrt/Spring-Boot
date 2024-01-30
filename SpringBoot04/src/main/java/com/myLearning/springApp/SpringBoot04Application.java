package com.myLearning.springApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.myLearning.springApp.beans.CourseSelection;


@SpringBootApplication
public class SpringBoot04Application {

	public static void main(String[] args) {
		//ConfigurableApplicationContext context = SpringApplication.run(SpringBoot04Application.class, args);
		//AnnotationConfigApplicationContext context = (AnnotationConfigApplicationContext) SpringApplication.run(SpringBoot04Application.class, args);
		ApplicationContext context = SpringApplication.run(SpringBoot04Application.class, args);
		
		CourseSelection course =  context.getBean("course",CourseSelection.class);
		//CourseSelection course = context.getBean(CourseSelection.class);
		boolean status = course.chooseCourse(2300.00);
	
		if(status)
		{
			System.out.println("Enrolled!!!");
		}
		else {
			System.out.println("Failed to enroll");
		}
		
		((ConfigurableApplicationContext)context).close();
	}

}
