package at.bals.games.spaceinvador;

import org.newdawn.slick.Graphics;

public class SpaceShips implements IShips {

	private double x;
	private double y;
	private double speed;

	public SpaceShips(int x, int y, double speed) {
		this.x = x;
		this.y = y;
		this.speed = speed;
	}

	@Override
	public void move(int delta) {
		// TODO Auto-generated method stub

		y = y + (delta * speed);

	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawOval((int) x, (int) y, 50, 50);

	}

}
