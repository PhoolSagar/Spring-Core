package in.scalive.beans;

import org.springframework.stereotype.Component;

@Component
public class FileDataSource implements DataSource {
	
	public FileDataSource() {
		System.out.println("FileDataSource bean created");
	}

	@Override
	public String[] getEmails() {
		String emails[] = {"phoolsagar@gmail.com","singhphoolsagar@gmail.com"};
		return emails;
	}

}
