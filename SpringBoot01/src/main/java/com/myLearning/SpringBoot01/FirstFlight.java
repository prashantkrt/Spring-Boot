package com.myLearning.SpringBoot01;

import org.springframework.stereotype.Component;

//dependency classs
@Component
public class FirstFlight implements DeliveryService {

	static {
		System.out.println("FirstFlight class is loaded");
	}

	public FirstFlight() {
		System.out.println("FirstFlight class object is created");
	}

	@Override
	public boolean courierService(double amount) {
		System.out.println("Courier deliered through FirstFlight and amont paid is " + amount);
		return true;
	}

}
