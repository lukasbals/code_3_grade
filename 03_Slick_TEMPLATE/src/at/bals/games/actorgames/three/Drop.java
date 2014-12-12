package at.bals.games.actorgames.three;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Drop implements ICar {
	private Image imgDrop;
	private double x, y;
	private double speed;

	public Drop(int x, int y, double speed) {
		this.x = x;
		this.y = y;
		this.speed = speed;
		try {
			this.imgDrop = new Image("testdata/drop.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
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
		imgDrop.draw((int) x, (int) y);
	}
}
