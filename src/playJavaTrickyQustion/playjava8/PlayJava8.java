package playJavaTrickyQustion.playjava8;

public interface PlayJava8 {

	public static void main(String[] args) {
		Integer i1 = 128;
		Integer i2 = 128;
		System.out.println(i1==i2); //false since range of integer is -127 to
		//127. Integer.valueof(128) check range of integer 
		//so that condition false so its prints false 
		
		Integer i3 = 127;
		Integer i4 = 127;
		System.out.println(i3 == i4);//true
	}
}
