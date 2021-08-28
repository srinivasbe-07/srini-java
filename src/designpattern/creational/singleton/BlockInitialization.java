package designpattern.creational.singleton;

public class BlockInitialization {

	private static BlockInitialization instance = null;
	private BlockInitialization() {

	}

	static {
		try {
			instance = new BlockInitialization();

		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	public static BlockInitialization getInstance() {
		return instance;
	}
	public static void main(String[] args) {
		System.out.println("1: " + BlockInitialization.getInstance().hashCode());
		System.out.println("2: " + BlockInitialization.getInstance().hashCode());
	}
}
