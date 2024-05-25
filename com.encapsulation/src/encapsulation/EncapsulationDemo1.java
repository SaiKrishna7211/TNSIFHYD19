package encapsulation;

public class EncapsulationDemo1 {
	public static void main(String[] args) {
		EncapsulationDemo e = new EncapsulationDemo ();
		e.setDoors("closed");
		e.getDoors();
		e.setEngine("on");
		e.getEngine();
		e.setDriver("seated");
		e.getDriver();
		e.setSpeed(70);
		e.getSpeed();
		e.run();
	}
}
