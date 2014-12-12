package at.bals.games.testgames;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import com.sun.medialib.mlib.Image;

public class FirstGame extends BasicGame {

	private int x;
	private int y;

	private Image img1;

	public FirstGame() {
		super("FirstGame");

	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		System.out.println("render");

		g.drawRect(x, y, 100, 200);
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		x = 0;
		y = 0;

	}

	@Override
	public void update(GameContainer gc, int g) throws SlickException {
		// TODO Auto-generated method stub
		x++;
		y++;

	}

	public static void main(String[] argv) {
		try {
			AppGameContainer container = new AppGameContainer(new FirstGame());
			container.setDisplayMode(800, 600, false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
