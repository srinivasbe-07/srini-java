package designpattern.behaviour.observer.newspaper;

public class NewsPaper {

	private String name;
	private String id;
	public NewsPaper(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "NewsPaper [name=" + name + ", id=" + id + "]";
	}
	
	
}
