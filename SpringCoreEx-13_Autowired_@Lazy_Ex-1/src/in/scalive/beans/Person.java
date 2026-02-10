package in.scalive.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Person  {
	private String name;
	private int roll;
	
	
	public Person() {
		System.out.println("Person object created");
	}
	
	@Value("Phoolsagar")
	public void setName(String name) {
		this.name = name;
	}

	@Value("39")
	public void setRoll(int roll) {
		this.roll = roll;
	}


	public void display() {
		System.out.println("Person's Name : "+name);
		System.out.println("Person's Roll : "+roll);
	}
	
	
}
