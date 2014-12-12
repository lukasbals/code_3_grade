package at.bals.computers;

public class iMac extends Computer {
	private int rateing;
	private CPU cpu;

	public iMac(String brand, int price, CPU c) {
		super(brand, price, c);
	}

	public int getRateing() {
		return rateing;
	}

	public void setRateing(int rateing) {
		this.rateing = rateing;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

}
