package at.bals.sample.oo.figures;

public class Grid {
	private Figure[] figures;

	public Grid() {
		figures = new Figure[10];

		figures[0] = new Rectangle(10, 16);
		figures[1] = new Circle(7);
		figures[2] = new Triangle(8, 9);

		System.out.println(figures[0].getArea());
		System.out.println(figures[1].getArea());
		System.out.println(figures[2].getArea());
	}
	
	public static void main(String[] args) {
		Grid g = new Grid();
	}
}
