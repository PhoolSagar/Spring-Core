package in.scalive.beans;

import java.util.Date;

public class Student {
	
	private String name;
	private int roll;
	private Date DOB;
	public Student(String name, int roll, Date dOB) {
		super();
		this.name = name;
		this.roll = roll;
		DOB = dOB;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Rollno. : "+roll);
		System.out.println("DOB : "+DOB);
	}
	
	
}
