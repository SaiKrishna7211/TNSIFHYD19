package keywords;

public class SuperKeywordDog extends SuperKeywordAnimal {
	public int a=super.a;
	public void eat() {
		System.out.println("dog is eating");
	}
	public void bark() {
		System.out.println("dog is barking");
	}
}
