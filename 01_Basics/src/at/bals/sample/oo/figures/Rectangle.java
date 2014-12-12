package at.bals.sample.oo.figures;

public class Rectangle extends Figure {
	private int length;
	private int height;

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.height = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return height;
	}

	public void setWidth(int width) {
		this.height = width;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * height;
	}

}
