package in.scalive.beans;

public class Student {
	
	private String name;
	private Teacher teacher;
	public Student() {
		System.out.println("Student bean created");
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	
}
