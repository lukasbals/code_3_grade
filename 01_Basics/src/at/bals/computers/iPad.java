package at.bals.computers;

public class iPad extends Computer{
	private int style;
	private CPU cpu;

	public iPad(String brand, int price, CPU c) {
		super(brand, price, c);
	}

	public int getStyle() {
		return style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

}
