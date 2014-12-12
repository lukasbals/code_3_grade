package at.ran.games.sample;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;

public class ThreeBWI extends BasicGame {
	private Nemo n;

	public ThreeBWI() {
		super("test");
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		n.draw(g);
		g.drawString("hello2",200, 200);

	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		n = new Nemo();

	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		n.update();
	}
	
	@Override
	public void keyPressed(int key, char c) {
		n.stop();
	}

	public static void main(String[] args) {
		try {
			AppGameContainer container = new AppGameContainer(new ThreeBWI());
			container.setDisplayMode(800, 600, false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
