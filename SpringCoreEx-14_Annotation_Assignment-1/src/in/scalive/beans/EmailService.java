package in.scalive.beans;

import org.springframework.stereotype.Component;

@Component
public class EmailService {
	private DataSource emails;
	
	public EmailService(DataSource emails) {
		this.emails = emails;
		System.out.println("EmailService bean created");
	}
	
	public void display() {
		System.out.println("Mail sending using : "+ emails.getClass().getName());
		String mails[] = emails.getEmails();
		for(String mail:mails) {
			System.out.println("Mail sending to : "+mail);
		}
	}

}
