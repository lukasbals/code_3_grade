package at.bals.sample.oo.figures;

public class Test {
	public static void main(String[] args) {
		Figure f1 = new Rectangle(5, 10);
		Figure f2 = new Triangle(5, 10);
		Figure f3 = new Circle(5);
		f1.setColor("green");

		System.out.println(f1.getArea());
		System.out.println(f2.getArea());
		System.out.println(f3.getArea());
	}

}
