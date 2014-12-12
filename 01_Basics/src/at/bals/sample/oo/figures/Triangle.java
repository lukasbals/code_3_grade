package at.bals.sample.oo.figures;

public class Triangle extends Figure {
	private int a;
	private int b;

	public Triangle(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (a * b) / 2;
	}

}
