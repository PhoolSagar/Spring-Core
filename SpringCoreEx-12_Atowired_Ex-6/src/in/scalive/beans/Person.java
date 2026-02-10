package in.scalive.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person  {
	private String name = "Phoolsagar";
	private Car car;
	
	public Person(String name) {
		System.out.println("Person bean createed with name");
	}
	public Person(Car car) {
		this.car = car;
		System.out.println("Person bean createed with car");
	}
	
	
	
	public void display() {
		System.out.println("Person's Name : "+name);
		System.out.println("Person's Car name : "+car.getcarName());
	}
	
	
}
