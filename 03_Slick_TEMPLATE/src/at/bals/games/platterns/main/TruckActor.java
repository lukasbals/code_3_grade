package at.bals.games.platterns.main;

import java.util.Random;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class TruckActor implements Actor {
	private Image image;
	private int x, y;

	public TruckActor() throws SlickException {
		this.image = new Image("testdata/truck.png");
		this.y = 0;
		Random r = new Random();
		this.x = r.nextInt(500);
	}

	public void move(int delta) {
		this.y++;
		if (this.y >= 600) {
			this.y = 0;
		}
	}

	public void paint(Graphics g) {
		g.drawImage(this.image, x, y);
	}
}
