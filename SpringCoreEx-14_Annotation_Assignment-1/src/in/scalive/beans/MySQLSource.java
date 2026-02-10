package in.scalive.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class MySQLSource implements DataSource {
	
	
	public MySQLSource() {
		System.out.println("MySQLSource bean created");
	}

	@Override
	public String[] getEmails() {
		String emails[] = {"abc@gmail.com","pqr@gmail.com"};
		return emails;
	}
}
