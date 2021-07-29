package playJavaTrickyQustion.playjava1;

class A {
	public A() {

		A a = new A();
	}

}

class B extends A {
	public B() {
		System.out.println("B");
	}
}

class C extends B {
	public C() {
		System.out.println("C");
	}
	public void printC() {
		System.out.println("C");
	}
}

public class PlayJava1 {
	public static void main(String[] args) {
		C c = null;
		c.printC();//throws null pointer exception.
	}

}
