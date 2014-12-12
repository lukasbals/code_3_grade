package at.bals.computers;

public class Computer {
	private String brand;
	private int price;
	private CPU cpu;


	public Computer(String brand, int price, CPU c) {
		super();
		this.brand = brand;
		this.price = price;
		this.cpu = c;

	}

	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

}
