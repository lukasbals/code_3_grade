package at.ran.games.state;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Rocket {
	private Image image;
	private int x, y;
	private double speed = 0.2; // 100px pro Sekunde
	private int time;
	private int distance;

	public Rocket() {

		this.x = 0;
		this.y = 0;
		try {
			image = new Image("testdata/rocket.png");
			image.setRotation(90);
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	public void update(int delta) {
		time += delta;
		x += (int) (delta * speed);
		System.out.println("time:" + time);
		System.out.println("x:"+x);
	}

	public void draw(Graphics g) {
		image.draw(x, y);
	}

}
