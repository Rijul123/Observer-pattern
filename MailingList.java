package MailingList;

public class MailingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MailPublisher publisher = new MailPublisher();
		MailSubscriber[] subscribers = new MailSubscriber[10];
		for (int i=0; i < 10; i++)
			subscribers[i] = new MailSubscriber(publisher);
		publisher.setNewEmail("Hello!");
		
	}

}
