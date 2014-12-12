package at.lukas.oo;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overhead o1 = new Overhead();
		o1.color = "green";
		o1.height = 17.4;
		o1.width = 12;
		o1.length = 19;

		Overhead o2 = new Overhead();
		o2.color = "red";
		o2.height = 10;
		o2.width = 10;
		o2.length = 10;

		System.out.println("Höhe von 1 ... " + o1.height);
		System.out.println("Höhe von 2 ... " + o2.height);

		System.out.println("Breite von 1 ... " + o1.width);
		System.out.println("Breite von 2 ... " + o2.width);

		System.out.println("Länge von 1 ... " + o1.length);
		System.out.println("Länge von 2 ... " + o2.length);

		System.out.println("Farbe von 1 ... " + o1.color);
		System.out.println("Farbe von 2 ... " + o2.color);
	}

}
