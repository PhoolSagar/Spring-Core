package in.scalive.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.scalive.beans.LapTop;
import in.scalive.beans.Programmer;



public class UseProgrammer {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("/in/scalive/resources/beanConf_1.xml", "/in/scalive/resources/beanConf_2.xml");
		System.out.println("Container started..");
		
		Programmer p1 = container.getBean(Programmer.class);
		System.out.println("Programmer name : "+ p1.getName());
		p1.writeCode();
		
		LapTop lp1 = p1.getLp();
		System.out.println("Brand name : "+ lp1.getBrand());
		lp1.start();
		
		
		
	}

}
