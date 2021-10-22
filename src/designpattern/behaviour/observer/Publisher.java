package designpattern.behaviour.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {

	List<Observer> observers = new ArrayList<Observer>();
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void detatch(Observer observer) {
		
		observers.remove(observer);
	}

	@Override
	public void notify(Message message) {
		
		observers.forEach((observer) -> observer.updateMessage(message));
		
	}

}
