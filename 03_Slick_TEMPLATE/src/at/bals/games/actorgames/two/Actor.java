package at.bals.games.actorgames.two;

import org.newdawn.slick.Graphics;

public interface Actor {
	public void move(int delta);

	public void render(Graphics g);

}
