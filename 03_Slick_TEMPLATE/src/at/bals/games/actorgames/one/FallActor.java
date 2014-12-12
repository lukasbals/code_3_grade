package at.bals.games.actorgames.one;

import org.newdawn.slick.Graphics;

public class FallActor implements Actor {
	private double x, y;
	private double time;

	private double speed;

	public FallActor(int x, int y, double speed) {
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.time = 0;
	}

	public void move(int delta) {
		time = time + ((double) delta / 1000.0);

		System.out.println("time" + time);

		y = (9.81 / 2 * time * time);
		x = (15 * time);

	}

	public void render(Graphics g) {
		g.drawRect((int) x, (int) y, 100, 50);
	}
}
