package com.myLearning.SpringBoot01;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//dependency classs
@Component
//@Primary
public class BlueDart implements DeliveryService {

	static {
		System.out.println("BlueDart class is loaded");
	}

	public BlueDart() {
		System.out.println("BlueDart object is created");
	}

	@Override
	public boolean courierService(double amount) {
		System.out.println("Courier deliered through BlueDart and amont paid is " + amount);
		return true;
	}
}
