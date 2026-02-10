package in.scalive.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.scalive.beans.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("/in/scalive/resources/beanConf.xml");
		System.out.println("Container started..");
		Student s1 = container.getBean("stObj1", Student.class);
		System.out.println("Roll = "+s1.getRoll());
		System.out.println("Roll = "+s1.getName());
		Student s2 = container.getBean("stObj2", Student.class);
		System.out.println("Roll = "+s2.getRoll());
		System.out.println("Roll = "+s2.getName());
		
	}

}
