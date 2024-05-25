package encapsulation;

public class EncapsulationDemo {
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public void getDoors() {
		System.out.println(doors);
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	
	public void getEngine () {
		System.out.println(engine);
	}
	public void setEngine (String engine) {
		this.engine = engine ;
	}
	
	public void getDriver () {
		System.out.println(driver);
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public void getSpeed() {
		System.out.println(speed);
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void run () {
		if(doors=="closed" && engine == "on" && driver=="seated" &&  speed>=0) {
			System.out.println("car is moving");
		} else {
			System.out.println("car is not moving");
		}
			
	}
}
