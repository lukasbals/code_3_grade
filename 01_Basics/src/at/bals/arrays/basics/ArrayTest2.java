package at.bals.arrays.basics;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[][] a = new int[4][4];
		int val = 1;
		int sum = 0;
		int diarow1 = 0;
		int diarow2 = 0;

		// Befüllen des Arrays
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				System.out.println("row = " + row + " - col = " + col);
				a[row][col] = val;
				val++;
				sum = sum + val - 1;
			}
		}
		System.out.println("Die Gesamtsumme = " + sum);

		// Berechnen der Zeilensummen
		for (int row = 0; row < a.length; row++) {
			int sumrow = 0;
			for (int col = 0; col < a[row].length; col++) {
				sumrow = sumrow + a[row][col];
			}
			System.out.println("Zeie " + row + " = " + sumrow);
		}

		// Berechnen der Diagonalen
		for (int row = 0; row < a.length; row++) {
			diarow1 = 0;
			for (int col = 0; col < a[row].length; col++) {

				diarow1 = diarow1 + a[col][col];
				diarow2 = 0;
				for (int i = 3; i >= 0; i = i - 1) {
					diarow2 = diarow2 + a[i][i];
				}
			}
		}
		System.out.println("Summe der Diagonale von links " + " = " + diarow1);
		System.out.println("Summe der Diagonale von rechts " + " = " + diarow2);
	}
}
