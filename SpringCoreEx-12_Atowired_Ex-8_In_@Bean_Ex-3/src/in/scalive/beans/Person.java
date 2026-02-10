package in.scalive.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person  {
	private String name;
	private Car car;
	
	
	
	
	public Person(Car car1, @Value("Phoolsagar") String name) {
		this.car = car1;
		this.name = name;
		System.out.println("Person bean createed with car");
	}
	
	
	
	public void display() {
		System.out.println("Person's Name : "+name);
		System.out.println("Person's Car name : "+car.getcarName());
	}
	
	
}
