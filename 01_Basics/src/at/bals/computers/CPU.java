package at.bals.computers;

public class CPU {
	private String munufacturer;
	private int clockrate;
	
	public CPU(String manufacturer, int clockrate) {
		super();
		this.munufacturer = munufacturer;
		this.clockrate = clockrate;
	}
	
	public String getMunufacturer() {
		return munufacturer;
	}
	
	public void setMunufacturer(String munufacturer) {
		this.munufacturer = munufacturer;
	}
	
	public int getClockrate() {
		return clockrate;
	}
	
	public void setClockrate(int clockrate) {
		this.clockrate = clockrate;
	}
	

}
