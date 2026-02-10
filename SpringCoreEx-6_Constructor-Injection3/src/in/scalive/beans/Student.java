package in.scalive.beans;

public class Student {
	
	private String name;
	
	public Student(String name) {
		System.out.println("Student str created");
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

}
