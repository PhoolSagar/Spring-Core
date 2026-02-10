package in.scalive.beans;

public class Programmer {
	
	private String name ;
	
	


	public Programmer() {
		System.out.println("Programmer bean created");
	}


	public void setName(String name) {
		this.name = name;
	}
	


	public String getName() {
		return name;
	}


	
	
}
