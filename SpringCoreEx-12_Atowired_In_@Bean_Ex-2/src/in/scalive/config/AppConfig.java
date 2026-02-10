package in.scalive.config;

import org.springframework.context.annotation.Configuration;

import in.scalive.beans.Car;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackages = "in.scalive.beans")
public class AppConfig {
	
	@Bean
	public Car car1() {
		Car car1 = new Car("Audi");
		return car1;
	}
	
}
