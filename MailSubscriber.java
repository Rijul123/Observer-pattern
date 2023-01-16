package MailingList;

import observable.Observer;
import observable.Observable;

public class MailSubscriber implements Observer{

	private Observable subject;
	private String emailData;
	
	public MailiSubscriber(Observable subject) {
		this.subject = subject;
		this.subject.register(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		this.emailData = 
				((MailPublisher) this.subject).getNewEmail();
		System.out.println("New mail!");
	}

	public String getEmailData() {
		return this.emailData;
	}
}
