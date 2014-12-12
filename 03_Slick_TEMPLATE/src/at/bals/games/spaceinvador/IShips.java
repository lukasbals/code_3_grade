package at.bals.games.spaceinvador;

import org.newdawn.slick.Graphics;

public interface IShips {
	public void move(int delta);

	public void render(Graphics g);
}
