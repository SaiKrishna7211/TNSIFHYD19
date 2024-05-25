package accessing;
class C {
	void diplay() {
		System.out.println("C");
	}
	static void display1 () {
		System.out.println("C1");
	}
}
class D extends C {
	void display() {
		System.out.println("D");
	}
	static void display1 () {
		System.out.println("D1");
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		D b=new D();
		b.display();
		D.display1();
	}

}
