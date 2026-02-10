package in.scalive.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.scalive.beans.Person;
import in.scalive.config.AppConfig;



public class UsePerson {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
		
	
		
		System.out.println("Container Started");
		
		Person p = (Person)container.getBean("person");
		p.display();
		
		
		
		
		
		
		
	}

}
