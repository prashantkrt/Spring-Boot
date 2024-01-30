package com.myLearning.springApp.beans;

import org.springframework.stereotype.Component;

//@Component("java") both are same
@Component(value="java")
public class Java implements Course {
	
	static {
		System.out.println("Java instantiated");
	}
	
	public Java()
	{
		System.out.println("Java bean is created and loaded");
	}

	@Override
	public boolean selectCourse(double amount) {
		System.out.println("Enrolled to Java Course "+amount);
		return true;
	}

}
