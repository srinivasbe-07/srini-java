package playJavaTrickyQustion.playjava6;


class A{
	public void name(StringBuffer stringBuffer) {
		System.out.println("String buffer");
	}
	public void name(String str) {
		System.out.println("string");
	}
	
}
public class PlayJava6 {

	public static void main(String[] args) {
		A a = new A();
		//a.name(null);//ambiguity issue because string buffer and string belong to same hierarchy java.lang 
	}
}

