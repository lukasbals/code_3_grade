package at.bals.games.actorgames.one;

import org.newdawn.slick.Graphics;

public class BulletActor implements Actor {
	private double x, y;

	private double speed;

	public BulletActor(int x, int y, double speed) {
		this.x = x;
		this.y = y;
		this.speed = speed;
	}

	public void move(int delta) {
		x = x + (delta * speed);

		if (x > 800) {
			x = 0;
		}
	}

	public void render(Graphics g) {
		g.drawOval((int) x, (int) y, 10, 10);
	}
}
