package playJavaTrickyQustion.playjava3;


class A {
	public A() {

		A a = new A();
	}

}


public class PlayJava3 {
	public static void main(String[] args) {
	  A a = new A();//looped throw stack overflow
	}

}
