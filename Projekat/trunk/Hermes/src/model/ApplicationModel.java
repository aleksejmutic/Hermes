/***********************************************************************
 * Module:  ApplicationModel.java
 * Author:  goran
 * Purpose: Defines the Class ApplicationModel
 ***********************************************************************/

package model;

import java.util.List;
import java.util.Vector;

import observer.Subscriber;

public class ApplicationModel implements observer.Subject {
	public ApplicationState applicationState;
	private ApplicationContext context;
	private List<Subscriber> subscribers;
	
	public ApplicationModel() {
		setContext(new ApplicationContext());
		setApplicationState(new IdleState(this));
		this.subscribers = new Vector<Subscriber>();
	}

	@Override
	public void notifySubscribers() {
		for (Subscriber subscriber : subscribers) {
			subscriber.update(this);
		}

	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	public ApplicationState getApplicationState() {
		return applicationState;
	}

	public void setApplicationState(ApplicationState applicationState) {
		this.applicationState = applicationState;
	}
	
	public void addSubscriber(Subscriber sub) {
		subscribers.add(sub);
	}

}