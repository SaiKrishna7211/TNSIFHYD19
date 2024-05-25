package accessing;
class A {
	void display() {
		System.out.println("As display");
	}
	static void display1 (int a) {
		System.out.println("As diaplay1");	
	}
}
class B extends A {
	void display() {
		System.out.println("Bs display");
	}
	static void display1 (int a) {
		System.out.println("Bs display1");
	}
	
}
public class MethodOverriding {
	public static void main(String[] args) {
		A b = new B();
		b.display();
		b.display1(2);
	}
}
