package in.scalive.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component

public class PhonePeGateway implements PaymentGateway {
	
	
	public PhonePeGateway() {
		System.out.println("PhonePeGateway bean created");
	}

	 public String[] getCustomers() {
	        return new String[]{"Sagar", "Amit", "Rahul"};
	    }

	    @Override
	    public String getGatewayName() {
	        return "PhonePe";
	    }
}
