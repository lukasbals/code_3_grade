package at.bals.semples.oo;

public class Tractor extends Vehicle {

	private boolean cableWinch=true;
	private boolean snowShovel=true;
	private Motor motor;
	
	public Tractor(int amountTires, String color, int speed, Motor m) {
		super(amountTires, color, speed, m);
		
	}
	
	public boolean isCableWinch() {
		return cableWinch;
	}

	public void setCableWinch(boolean cableWinch) {
		this.cableWinch = cableWinch;
	}

	public boolean isSnowShovel() {
		return snowShovel;
	}

	public void setSnowShovel(boolean snowShovel) {
		this.snowShovel = snowShovel;
	}

	public void bschuett() {
		System.out.println("im beschuetting now");
	}
	
	

}
