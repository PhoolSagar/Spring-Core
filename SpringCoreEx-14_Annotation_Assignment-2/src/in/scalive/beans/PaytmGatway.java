package in.scalive.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component

public class PaytmGatway implements PaymentGateway {
	
	public PaytmGatway() {
		System.out.println("PaytmGatway bean created");
	}

	@Override
	public String[] getCustomers() {
		String Cust[] = {"Angad", "Bittu"};
		return Cust;
	
	}

	@Override
	public String getGatewayName() {
		return "Paytm";
		
	}

}
