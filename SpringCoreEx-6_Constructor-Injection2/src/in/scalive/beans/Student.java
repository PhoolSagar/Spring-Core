package in.scalive.beans;

public class Student {
	
	private int roll;
	private String name;
	
	public Student(int roll) {
		System.out.println("Student int created");
		this.roll = roll;
	}
	
	public Student (String name) {
		System.out.println("Student str created");
		this.name = name;
	}
	
	
	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

}
