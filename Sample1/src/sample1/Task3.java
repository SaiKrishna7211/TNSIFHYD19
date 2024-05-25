package sample1;

public class Task3 {
	int a=10;
	static int b=20;
	void display4() {
		System.out.println("in diplay");
	}
	static String display5() {
		return "in display1";
	}
}

class A {
	public static void main(String[] args) {
		int c=30;
		System.out.println(c);
		Task3 t3=new Task3();
		System.out.println(t3.a);
		t3.display4();
		System.out.println(Task3.b);
		Task3.display5();
	}
}