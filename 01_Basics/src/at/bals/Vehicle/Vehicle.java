package at.bals.Vehicle;

public class Vehicle {
	private int wheels;
	private String name;
	private Door[] doorArr;

	public Vehicle(String name) {
		this.name = name;
		this.doorArr = new Door[5];
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Door[] getDoorArr() {
		return doorArr;
	}

	public void setDoorArr(Door[] doorArr) {
		this.doorArr = doorArr;
	}
	
}
