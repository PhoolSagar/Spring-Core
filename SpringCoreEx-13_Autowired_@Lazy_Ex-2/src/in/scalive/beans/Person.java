package in.scalive.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Person  {
	private String name;
	private int roll;
	
	
	public Person(String name , int roll) {
		this.name = name ;
		this.roll = roll;
		System.out.println("Person object created");
	}
	
	

	public void display() {
		System.out.println("Person's Name : "+name);
		System.out.println("Person's Roll : "+roll);
	}
	
	
}
