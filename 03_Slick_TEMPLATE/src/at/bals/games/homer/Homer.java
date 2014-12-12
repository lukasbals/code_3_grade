package at.bals.games.homer;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Homer implements iActor {
	private Image img1;
	private int x, y;

	public Homer() {
		this.x = 50;
		this.y = 50;
		try {
			this.img1 = new Image("testdata/homer.jpeg");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void moveDown(int delta) {
		y++;
	}

	public void moveLeft(int delta) {
		x--;
	}

	public void moveRight(int delta) {
		x++;
	}

	public void moveUp(int delta) {
		y--;
	}

	public void move(int delta) {

	}

	public void render(Graphics g) {
		img1.draw(x, y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
