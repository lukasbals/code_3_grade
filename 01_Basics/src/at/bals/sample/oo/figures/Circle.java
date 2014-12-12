package at.bals.sample.oo.figures;

public class Circle extends Figure {
	private int r;

	public Circle(int r) {
		super();
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return r * r * Math.PI;
	}

}
