package in.scalive.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import in.scalive.beans.Person;


@Configuration
@ComponentScan(basePackages = "in.scalive.beans")
public class AppConfig {
	
	@Bean
	@Lazy
	public Person person() {
		Person p = new Person("Sagar", 39);
		return p;
	}
	
	
}
