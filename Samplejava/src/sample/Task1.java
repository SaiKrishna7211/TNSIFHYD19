package sample;

public class Task1 {
	int a=20;
	static int b=10;
	void Display() {
		System.out.println("numbers");
	}
	static String Display1() {
		return "5";
	}
	public static void main(String[] args) {
		int c=30;
		System.out.println(c);
		Task1 t1=new Task1();
		System.out.println(t1.a);
		t1.Display();
		System.out.println(Task1.b);
		Display1();
	}	
}
