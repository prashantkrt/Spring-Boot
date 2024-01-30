package com.myLearning.springApp.beans;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public LocalDateTime createTimeBean() {
		return LocalDateTime.now();
	}
}
