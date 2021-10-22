package designpattern.behaviour.observer.newspaper;

import java.util.ArrayList;
import java.util.List;

public class NewsPaperPublisher {

	List<NewsPaperSubscriber> newsPaperSubscribers;
	
	public NewsPaperPublisher() {
		newsPaperSubscribers = new ArrayList<NewsPaperSubscriber>();
	}
	
	
	public void registerSubscriber(NewsPaperSubscriber newsPaperSubscriber) {
		newsPaperSubscribers.add(newsPaperSubscriber);
	}
	
	public void publishNewsPaper(NewsPaper newsPaper) {
		for(NewsPaperSubscriber newsPaperPublisher : newsPaperSubscribers) {
			newsPaperPublisher.addNewsPaper(newsPaper);
		}
	}
}
