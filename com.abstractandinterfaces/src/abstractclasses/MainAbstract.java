package abstractclasses;

public class MainAbstract {
	public static void main(String[] args) {
		Cat c=new Cat();
		Dog d=new Dog();
		c.sound();
		c.eat("Cat");
		d.sound();
		d.eat("Dog");
	}
}
