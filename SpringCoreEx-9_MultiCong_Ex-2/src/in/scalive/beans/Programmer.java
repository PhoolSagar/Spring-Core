package in.scalive.beans;

public class Programmer {
	
	private String name ;
	private LapTop lp;
	
	public Programmer() {
		System.out.println("Programmer bean created");
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	

   public LapTop getLp() {
		return lp;
	}


	public void setLp(LapTop lp) {
		this.lp = lp;
	}


   public void writeCode() {
	   boolean result = lp.start();
	   if(result) {
		   System.out.println("Coding Started");
	   }
	   else {
		   System.out.println("Cannot write code");
	   }
   }
	
	
}
