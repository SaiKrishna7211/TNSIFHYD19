package user_defined_main;

import user_defined.*;

public class TypesOfDevices {
	public static void main(String[] args) {
		Laptops l = new Laptops ();
		Phones p = new Phones ();
		Tabs t = new Tabs ();
		l.dell();
		l.hp();
		l.lenovo();
		p.iphone();
		p.samsung();
		p.realme();
		t.vivo();
		t.oppo();
		t.oneplus();
	}
}
