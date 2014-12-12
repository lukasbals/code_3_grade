package BattleShip;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

import at.bals.arrays.TicTacToe.TTTPoint;

public class BattleShip {
	boolean allShipsBombed = false;

	// Feldgröße
	private static final int SIZE_X = 10;
	private static final int SIZE_Y = 10;

	// schiff ... schiff getroffen ... leer getroffen
	private static final int SCHIFF = 1;
	private static final int SCHIFF_GETROFFEN = 2;
	private static final int NICHT_GETROFFEN = 3;

	// Array
	private int[][] grid;

	// BattleShip wo ma des züg ine dua muss
	public BattleShip() {
		grid = new int[SIZE_X][SIZE_Y];

		setShips();
		while (isWinner() == false) {
			TTTPoint p = readInput();

			// Hat mal schonmal hier geschossen?
			if (grid[p.getX()][p.getY()] == NICHT_GETROFFEN || grid[p.getX()][p.getY()] == SCHIFF_GETROFFEN) {
				System.out.println("Hier wurde schon einmal geschossen");
			} else {

				// was habe ich getroffen?
				if (grid[p.getX()][p.getY()] == 0) {
					grid[p.getX()][p.getY()] = NICHT_GETROFFEN;
					printGrid();
				} else {
					System.out.println("Schiff getroffen!");
				}

				if (grid[p.getX()][p.getY()] == SCHIFF) {
					grid[p.getX()][p.getY()] = SCHIFF_GETROFFEN;
					printGrid();
				} else {
					System.out.println("Nicht getroffen Schnaps gesoffen");
				}
			}

			if (isWinner()) {
				System.out.println("Alle Schiffe sind versenkt!");
			}
		}
	}

	private boolean isWinner() {
		for (int width = 0; width < SIZE_X; width++) {
			for (int height = 0; height < SIZE_Y; height++) {
				if (grid[width][height] == 1) {
					return false;
				}
			}
		}
		return true;
	}

	// das array mit nullen füllen
	private void init() {
		for (int width = 0; width < SIZE_X; width++) {
			for (int height = 0; height < SIZE_Y; height++) {
				grid[width][height] = 0;
			}
		}
	}

	// Schiffe setzen
	private boolean setShips() {
		Random r = new Random();

		int x = r.nextInt(SIZE_X);
		return false;
	}

	// sollte das Grid ausgeben
	private void printGrid() {
		for (int width = 0; width < SIZE_X; width++) {
			for (int height = 0; height < SIZE_Y; height++) {
				System.out.print(grid[width][height] + " ");
			}
			System.out.println();
		}
	}

	// liest die eingabe wandelt sie in int um
	private TTTPoint readInput() {
		boolean isOk = false;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		while (!isOk) {
			try {
				String str = br.readLine();
				String[] strArr = str.split(" ");

				// String in int umwandeln
				int x = Integer.parseInt(strArr[0]);
				int y = Integer.parseInt(strArr[1]);

				// prüfen ob die Eingabe Ok ist
				if ((x < 0 || x > SIZE_X) || (y < 0 || y > SIZE_Y)) {
					isOk = false;
					System.out.println("Die zwei Zahlen müssen zwischen 0 und und der Spielfeldgröße liegen.");
				} else {
					TTTPoint p = new TTTPoint(x, y);
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
		BattleShip b = new BattleShip();
	}
}
