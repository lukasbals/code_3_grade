package at.bals.games.selfmade;

import ch.aplu.jgamegrid.GGMouse;
import ch.aplu.jgamegrid.GGMouseListener;
import ch.aplu.jgamegrid.GameGrid;
import ch.aplu.jgamegrid.Location;

public class FourInARow extends GameGrid implements GGMouseListener {
	private boolean isYellow = true;

	public static void main(String[] args) {
		FourInARow bw = new FourInARow();
		bw.show();
		bw.doRun();
		int[][] grid = new int[7][6];
		int val = 2;
		int Cy;

		// Befüllen des Arrays
		for (int y = 0; y < grid.length; y++) {
			for (int x = 0; x < grid[y].length; x++) {
				System.out.println("y" + x + "x" + x);
				grid[y][x] = val;
			}
		}
	}

	private void init() {
		isYellow = true;
	}

	public FourInARow() {
		super(7, 7, 70, "sprites/4inARowBG.png");

		// super(7, 7, 70, null, null, false);

		playSound("wav/groove.wav");
		addMouseListener(this, GGMouse.lClick);
	}

	@Override
	public boolean mouseEvent(GGMouse mouse) {
		// System.out.println(mouse.getX());

		Location location = toLocationInGrid(mouse.getX(), mouse.getY());

		// System.out.println(location.getX());

		int x = (location.getX());

		System.out.println("das ist x: " + x);
		System.out.println("das ist y: " + getAlignmentY());

		Stone s1;
		if (isYellow) {
			s1 = new Stone(1);
			isYellow = false;
		} else {
			s1 = new Stone(0);
			isYellow = true;
		}

		addActor(s1, new Location(x, 0));

		return false;
	}


//	private void setStone(int player, int x) {
//		boolean found = false;
//		int y = 0;
//		while (!found) {
//			if (grid[x][y] == 2) {
//				y++;
//			} else {
//				grid[x][y - 1] = player;
//				found = true;
//			}
//			System.out.println(player);
//		}
//	}
}
