package in.scalive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.scalive.beans.Car;
import in.scalive.beans.Person;

@Configuration
@ComponentScan(basePackages = "in.scalive.beans")
public class AppConfig {
	
	@Bean
	public Car car() {
		Car car = new Car("Ferrari");
		return car;
	}
	
	
	
	@Bean
	public Person person(Car c) {
		Person p = new Person(c,"Sagar");
		return p;
	}
	
	
}
