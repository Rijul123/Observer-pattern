package MailingList;

import java.util.ArrayList;
import java.util.List;

import observable.Observable;
import observable.Observer;

public class MailPublisher extends Observable {
	
	private List<Observer> subscribers;
	private String newEmail;
	
	public MailPublisher() {
		this.subscribers = new ArrayList<>();
		this.setObservableState(false);
	}

	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		if (this.subscribers.indexOf(o)	== -1)
			this.subscribers.add(o);
	}

	@Override
	public void unregister(Observer o) {
		// TODO Auto-generated method stub
		int pos = this.subscribers.indexOf(o);
		if (pos >= 0)
			this.subscribers.remove(pos);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		if (this.getObservableState()) {
		for (Observer ob: this.subscribers)
			ob.update();
		this.setObservableState(false);
		}
	}
	
	public void setNewEmail(String message) {
		this.newEmail = message;
		this.setObservableState(true);
	};
	
	public String getNewEmail() {
		return this.newEmail;
	}

}
