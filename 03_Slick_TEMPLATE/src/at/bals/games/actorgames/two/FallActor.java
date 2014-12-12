package at.bals.games.actorgames.two;

import org.newdawn.slick.Graphics;

public class FallActor implements Actor {
	private double x, y;
	private double speed;

	public FallActor(int x, int y, double speed) {
		this.x = x;
		this.y = y;
		this.speed = speed;

	}

	@Override
	public void move(int delta) {
		// TODO Auto-generated method stub
		y = y + (delta * speed);

		if (y > 600) {
			y = 0;
		}
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawOval((int) x, (int) y, 100, 100);
	}

}
