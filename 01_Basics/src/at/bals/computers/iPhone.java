package at.bals.computers;

public class iPhone extends Computer{
	private boolean keyboard = true;
	private CPU cpu;

	public iPhone(String brand, int price, CPU c) {
		super(brand, price, c);
	}

	public boolean isKeyboard() {
		return keyboard;
	}

	public void setKeyboard(boolean keyboard) {
		this.keyboard = keyboard;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
}
