package accessing;

public class AccessingVariablesInstanceMethod {
	int a= 10;
	static int b=20;
	void display () {
		System.out.println(a);
		System.out.println(AccessingVariablesInstanceMethod.b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessingVariablesInstanceMethod avim = new AccessingVariablesInstanceMethod();
		avim.display();
	}

}
