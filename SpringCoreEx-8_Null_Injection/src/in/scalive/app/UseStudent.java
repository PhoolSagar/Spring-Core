package in.scalive.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.scalive.beans.Student;


public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("/in/scalive/resources/beanConf.xml");
		System.out.println("Container started..");
		Student s1 = (Student)container.getBean("st1");
		s1.display();
		Student s2 = (Student)container.getBean("st2");
		s2.display();
		
		
	}

}
