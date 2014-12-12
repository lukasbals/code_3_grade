package at.bals.games.actorgames.one;

import org.newdawn.slick.Graphics;

public interface Actor {
	public void move(int delta);

	public void render(Graphics g);
}
