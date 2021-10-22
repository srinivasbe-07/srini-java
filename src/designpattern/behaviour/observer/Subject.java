package designpattern.behaviour.observer;

public interface Subject {

	public void attach(Observer observer);
	public void detatch(Observer observer);
	public void notify(Message message);
}
