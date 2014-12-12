package at.bals.games.spaceinvador;

import org.newdawn.slick.Graphics;

public class MyShip implements IShips {

	private double x, y;

	private int shipSize;

	private double speed;

	public MyShip(double speed) {
		this.speed = speed;
	}

	@Override
	public void move(int delta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		shipSize = 45;
		y = 800 - shipSize - 20;
		g.drawRect((int) x, (int) y, shipSize, shipSize);
	}

	public void moveLeft(int delta) {
		if (x < 0) {

		} else {
			x = x - (delta * speed);
		}
		// System.out.println("X" + x);
	}

	public void moveRight(int delta) {
		if (x > 749) {

		} else {
			x = x + (delta * speed);
		}
		// System.out.println("X" + x);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
}
