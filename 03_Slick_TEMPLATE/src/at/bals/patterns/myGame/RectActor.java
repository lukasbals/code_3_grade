package at.bals.patterns.myGame;

import org.newdawn.slick.Graphics;

public class RectActor implements Actors {
	private int x, y;

	@Override
	public void move() {
		// TODO Auto-generated method stub
		this.x++;
		this.y++;
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawRect(x, y, 10, 10);
	}

}
