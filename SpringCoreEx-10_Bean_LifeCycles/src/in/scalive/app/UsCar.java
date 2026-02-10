package in.scalive.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.scalive.beans.Car;



public class UsCar {
	public static void main(String[] args) {
		AbstractApplicationContext container = new ClassPathXmlApplicationContext("/in/scalive/resources/beanConf.xml");
		
		container.registerShutdownHook();
		Car car = (Car)container.getBean("carobj");
		car.driven();
		
		
		
	}

}
