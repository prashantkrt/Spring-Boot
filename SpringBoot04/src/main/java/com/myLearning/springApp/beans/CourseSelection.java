package com.myLearning.springApp.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//target class
@Component("course")
public class CourseSelection {

	@Autowired
	@Qualifier("java") // only at field , variable and method level
	private Course course;
	
	@Autowired
	private LocalDateTime date;

	static {
		System.out.println("CourseSelection instantiated");
	}

	{
		System.out.println("CourseSelection bean is created");
	}

	public CourseSelection() {
		System.out.println("CourseSelection bean is created-> Contructor");
	}

	public boolean chooseCourse(double amount) {
		System.out.println("Today's time and date is "+date);
		return course.selectCourse(amount);
	}
}
