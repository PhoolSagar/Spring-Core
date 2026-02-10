package in.scalive.beans;

public class Teacher {
	
	private String name;
	private Student student;
	public Teacher(String name, Student student) {
		System.out.println("Student bean created");
		this.name = name;
		this.student = student;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	

}
