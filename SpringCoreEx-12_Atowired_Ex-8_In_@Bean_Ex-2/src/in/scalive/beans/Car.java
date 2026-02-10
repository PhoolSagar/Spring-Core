package in.scalive.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Car  {
	private String carName;
	
	public Car(String carName) {
		this.carName = carName;
		System.out.println("Creating car bean");
	}
	
	public String getcarName() {
		return carName;
	}
	
}
