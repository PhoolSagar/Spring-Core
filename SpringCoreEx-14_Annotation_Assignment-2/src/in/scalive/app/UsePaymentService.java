package in.scalive.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.scalive.beans.PaymentService;
import in.scalive.config.AppConfig;



public class UsePaymentService {
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
		
	
		
		System.out.println("Container Started");
		PaymentService p = container.getBean(PaymentService.class);
		p.processPayments();
		
		
		
		
		
		
		
		
		
	}

}
