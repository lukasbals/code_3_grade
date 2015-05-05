package at.bals.games.platterns.main;

import org.newdawn.slick.Graphics;

public interface Actor {
	public void move(int delta);

	public void paint(Graphics g);
}
