package at.bals.arrays.TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToe {
	// Feldgröße
	private static final int size = 3;

	// Spielfeld
	private int[][] grid;
	private boolean isPlayer1 = true;

	private int isWinner() {
		// check rows
		for (int row = 0; row < size; row++) {
			if (grid[row][0] == grid[row][1] && grid[row][0] == grid[row][2] && grid[row][0] != 0) {
				System.out.println("And the winner is : " + grid[row][0]);
			}
		}
		// check cols
		for (int col = 0; col < size; col++) {
			if (grid[0][col] == grid[1][col] && grid[0][col] == grid[2][col] && grid[0][col] != 0) {
				System.out.println("And the winner is : " + grid[0][col]);
			}
		}
		// check diagonals
		if (grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2] && grid[0][0] != 0) {
			System.out.println("And the winner is : " + grid[0][0]);
		}
		if (grid[0][2] == grid[1][1] && grid[0][2] == grid[2][0] && grid[0][2] != 0) {
			System.out.println("And the winner is : " + grid[0][2]);
		}
		// is grid fully
		if (grid[0][0] != 0 && grid[1][0] != 0 && grid[2][0] != 0) {
			if (grid[0][1] != 0 && grid[1][1] != 0 && grid[2][1] != 0) {
				if (grid[0][2] != 0 && grid[1][2] != 0 && grid[2][2] != 0) {
					System.out.println("Nobody is the winner");
					init();
				}
			}
		}
		return 0;
	}

	/*
	 * Konstruktor - Initialisiert das Spiel
	 */
	public TicTacToe() {
		this.grid = new int[size][size];
		init();

		while (isWinner() == 0) {
			TTTPoint p = readInput();
			if (grid[p.getX()][p.getY()] == 0) {
				if (isPlayer1) {
					grid[p.getX()][p.getY()] = 1;
					isPlayer1 = false;
				} else {
					grid[p.getX()][p.getY()] = 2;
					isPlayer1 = true;
				}
				printGrid();
			} else {
				System.out.println("Dieses Feld ist schon belegt.");
			}
		}

		setTestData();
		printGrid();
		isWinner();
	}

	// Testlauf
	private void setTestData() {
		grid[2][2] = 1;
		grid[1][1] = 1;
		grid[0][0] = 1;
	}

	/*
	 * Mit Nullen befüllen
	 */
	private void init() {
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				grid[row][col] = 0;
			}
		}
	}

	// Zum in die Console einsetzen
	private void printGrid() {
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				System.out.print(grid[row][col] + " ");
			}
			System.out.println();
		}
	}

	
	private TTTPoint readInput() {
		boolean isOk = false;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		while (!isOk) {
			try {
				if (isPlayer1 == false) {
					System.out.println("Spieler 2 ist an der Reihe:");
				} else {
					System.out.println("Spieler 1 ist an der Reihe:");
				}

				String str = br.readLine();
				String[] strArr = str.split(" ");

				// String in int umwandeln
				int num1 = Integer.parseInt(strArr[0]);
				int num2 = Integer.parseInt(strArr[1]);

				// prüfen ob die Eingabe Ok ist
				if ((num1 < 0 || num1 > 2) || (num2 < 0 || num2 > 2)) {
					isOk = false;
					System.out.println("Die zwei Zahlen müssen zwischen 0 und 2 liegen.");
				} else {
					TTTPoint p = new TTTPoint(num1, num2);
					isOk = true;
					return p;
				}

			} catch (Exception e) {
				System.out.println("Eingabe falsch, es müssen zwei Zahlen sein");
				isOk = false;
			}
		}
		return null;
	}

	// Startet das Spiel
	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
	}

}
