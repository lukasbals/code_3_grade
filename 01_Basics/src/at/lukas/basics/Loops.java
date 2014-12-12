package at.lukas.basics;
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printFor();
		printWhile();
	}

	public static void printFor() {
		
		System.out.println("For Loop");

		for (int i = 0; i < 10; i++) {
			System.out.println("Ich bin Nummer:" + i);
		}
	}

	public static void printWhile() {
		int i; // Deklarieren
		i = 0; // Initialisieren

		while (i < 10) {
			System.out.println("I am a while loop:" + i);
			i = i + 1;
		}
	}

}
