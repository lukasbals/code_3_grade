package at.bals.semples.oo;

public class Car extends Vehicle {

	private boolean hasGPS = true;
	private boolean hasABS = true;
	private Motor motor;
	
	public Car(int amountTires, String color, int speed, Motor m) {
		super(amountTires, color, speed, m);
	}

	public boolean isHasGPS() {
		return hasGPS;
	}

	public void setHasGPS(boolean hasGPS) {
		this.hasGPS = hasGPS;
	}

	public boolean isHasABS() {
		return hasABS;
	}

	public void setHasABS(boolean hasABS) {
		this.hasABS = hasABS;
	}

	public void drift() {
		System.out.println("im drifting now");
	}

}
