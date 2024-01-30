package com.myLearning.springApp.beans;

import org.springframework.stereotype.Component;

@Component("springBoot")
public class SpringBoot implements Course {
	
	static {
		System.out.println("Spring is instantiated");
	}
	
	public SpringBoot()
	{
		System.out.println("SpringBoot bean is loaded");
	}

	@Override
	public boolean selectCourse(double amount) {
		System.out.println("Enrolled to SpringBoot course "+amount);
		return true;
	}

}
