package playJavaTrickyQustion.playjava5;

class A{
	public void name(Object obj) {
		System.out.println("Object");
	}
	public void name(String str) {
		System.out.println("string");
	}
	
}
public class PlayJava5 {

	public static void main(String[] args) {
		A a = new A();
		a.name(null);//call string name because its more specific
	}
}
