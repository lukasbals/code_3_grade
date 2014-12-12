package at.ran.games.testgame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tests.PackedSheetTest;

public class TestGameMarkus extends BasicGame {
	private String test;

	public TestGameMarkus(String title) {
		super("Tioel");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		g.drawString("Das ist gut" + test, 100, 100);

	}

	@Override
	public void init(GameContainer gc) throws SlickException {

		test = "hello";
	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		System.out.println("delta:" + delta);

	}

	public static void main(String[] args) {
		try {
			AppGameContainer container = new AppGameContainer(new TestGameMarkus("sup"));
			container.setDisplayMode(800, 600, false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}

	}

}
