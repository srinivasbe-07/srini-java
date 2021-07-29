package playJavaTrickyQustion.playjava10;

public final class PlayJava10 {

	 public static void main(String[] args) {
		//static String str = "str"; 
		 
		 final class FinalClassAllow{
			 public void printData() {
				 System.out.println("final class allow in static method but not static variable on static method");
			 }
		 }
		 FinalClassAllow finalClassAllow = new FinalClassAllow();
		 finalClassAllow.printData();
	}
	 
}