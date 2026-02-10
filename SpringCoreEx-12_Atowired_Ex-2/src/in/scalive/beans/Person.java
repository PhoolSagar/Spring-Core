package in.scalive.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person  {
	private String name = "Phoolsagar";
	private Car car;
	
	public Person() {
		System.out.println("Person bean createed");
	}
	
	@Autowired
	public void SetCar(Car car) {
		this.car = car;
	}
	
	public void display() {
		System.out.println("Person's Name : "+name);
		System.out.println("Person's Car name : "+car.getcarName());
	}
	
	
}
