package in.scalive.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.scalive.beans.Student;
import in.scalive.beans.Teacher;

public class UseStudent {
	public static void main(String[] args) {
		ApplicationContext container = new ClassPathXmlApplicationContext("/in/scalive/resources/beanConf.xml");
		System.out.println("Container started..");
		
		Student s1 = container.getBean(Student.class);
        System.out.println(s1.getName());
        Teacher t1 = s1.getTeacher();
        System.out.println(t1.getName());
		
	}

}
