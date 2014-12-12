package at.ran.games.sample;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Circle;

public class Nemo {
	private Circle c;
	private int x, y;
	private boolean isWalking = true;

	public Nemo() {
		x = 100;
		y = 100;
		c = new Circle(x, y, 100);
	}

	public void draw(Graphics g) {
		g.draw(c);

	}

	public void stop() {
		isWalking = false;
	}

	public void update() {
		if (isWalking) {
			x++;
			c.setX(x);
		}
	}

}
