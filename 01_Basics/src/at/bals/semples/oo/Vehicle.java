package at.bals.semples.oo;

public class Vehicle {
	private int amountTires;
	private String color;
	private int speed;
	private Motor motor;

	
	public Vehicle(int amountTires, String color, int speed, Motor m) {
		super();
		this.amountTires = amountTires;
		this.color = color;
		this.speed = speed;
		this.motor = m;
	}

	
	public void move() {
		System.out.println("im moving now with vollgas");
	}

	public int getAmountTires() {
		return amountTires;
	}

	public void setAmountTires(int amountTires) {
		this.amountTires = amountTires;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
