package in.scalive.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import in.scalive.beans.Student;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("/in/scalive/resources/beanConf.xml");
		System.out.println("Container started..");
		Student s1 = (Student)container.getBean("stObj1");
		System.out.println("Roll = "+s1.getRoll());
		System.out.println("Roll = "+s1.getName());
		Student s2 = (Student)container.getBean("stObj2");
		System.out.println("Roll = "+s2.getRoll());
		System.out.println("Roll = "+s2.getName());
		
	}

}
