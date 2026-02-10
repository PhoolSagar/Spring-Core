package in.scalive.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Car  {
	private String brand;

	public Car() {
		System.out.println("Car object created..");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void driven() {
		System.out.println("Car is getting driven.........");
	}
	
	@PostConstruct
	public void startCar() {
		System.out.println("Car has started.........");
	}
	
	@PreDestroy
	public void stopCar() {
		System.out.println("Car has stopped.........");
	}


	
}
