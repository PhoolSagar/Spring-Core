package in.scalive.beans;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    private PaymentGateway gateway;

    // Constructor Injection
    public PaymentService(PaymentGateway gateway) {
        this.gateway = gateway;
        System.out.println("PaymentService bean created");
    }

    public void processPayments() {

        System.out.println("Payment Gateway Used : " + gateway.getGatewayName());

        String[] customers = gateway.getCustomers();

        for (String customer : customers) {
            System.out.println("Processing payment for : " + customer);
        }
    }

}
