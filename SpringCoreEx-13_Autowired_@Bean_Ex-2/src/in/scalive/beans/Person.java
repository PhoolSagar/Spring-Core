package in.scalive.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Person  {
	private String name;
	private Car car;
	
	
	
	public Person(Car car, String name) {
		
		this.name = name;
		this.car = car;
		
		System.out.println("Creating person with car and name");
	}
	
	public void display() {
		System.out.println("Person's Name : "+name);
		System.out.println("Person's Car name : "+car.getcarName());
	}
	
	
}
