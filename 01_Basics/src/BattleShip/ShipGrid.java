package BattleShip;

import java.util.Random;

public class ShipGrid {
	private static final int WIDTH = 7;
	private static final int HEIGHT = 7;
	private int[][] grid;

	// Hilfsobjekte
	private Random random = new Random();

	public ShipGrid() {
		this.grid = new int[WIDTH][HEIGHT];
		setDummyData(10);
		printGrid();
		setShip(3);
	}

	private void setShip(int size) {
		// get new point
		int[] point = getRandomStartPosition(size);

		// check if point is valid
		if (isSetPossible(point[0], point[1], size)) {
			System.out.println("possible");
		} else {
			System.out.println("not possible");
		}
	}

	private int[] getRandomStartPosition(int size) {
		int x = random.nextInt(WIDTH - size + 1);
		int y = random.nextInt(HEIGHT);

		int[] point = new int[2];
		point[0] = x;
		point[1] = y;

		System.out.println("X:" + x + "Y:" + y);

		return point;
	}

	private boolean isSetPossible(int x, int y, int size) {
		for (int i = x; i < size + x; i++) {
			if (grid[i][y] == 1) {
				return false;
			}
		}
		return true;
	}

	private void setDummyData(int amount) {
		for (int i = 0; i < amount; i++) {
			int x = random.nextInt(WIDTH);
			int y = random.nextInt(HEIGHT);
			grid[x][y] = 1;
		}
	}

	private void printGrid() {
		for (int y = 0; y < HEIGHT; y++) {
			for (int x = 0; x < WIDTH; x++) {
				System.out.print(grid[x][y] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ShipGrid sg = new ShipGrid();
	}
}
