package playJavaTrickyQustion.playjava2;

class A {
	public A() {

		System.out.println("A");
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
}

public class PlayJava2 {
	public static void main(String[] args) {
		C c = new C();
	}

}

