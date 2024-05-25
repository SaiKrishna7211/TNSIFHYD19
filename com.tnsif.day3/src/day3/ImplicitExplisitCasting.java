package day3;

public class ImplicitExplisitCasting {
	byte a=5;
	int b=a;
	int c=15;
	byte d=(byte)c;
	public static void main(String[] args) {
		ImplicitExplisitCasting obj=new ImplicitExplisitCasting();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
}
