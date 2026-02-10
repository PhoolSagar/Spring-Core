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
		Student s1 = container.getBean(Student.class);
		System.out.println("Roll = "+s1.getRoll());
		System.out.println("Roll = "+s1.getName());
		
	}

}
