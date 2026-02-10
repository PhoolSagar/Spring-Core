package in.scalive.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car  {
	private String carName = "Audi";
	
	public Car() {
		System.out.println("Creating car bean");
	}
	
	public String getcarName() {
		return carName;
	}
	
}
