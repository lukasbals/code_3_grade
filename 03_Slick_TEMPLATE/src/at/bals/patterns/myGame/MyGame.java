package at.bals.patterns.myGame;

import java.util.ArrayList;
import java.util.List;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import at.bals.patterns.moveStategy.MoveStrategy;
import at.bals.patterns.moveStategy.RightStrategy;

public class MyGame extends BasicGame {
	private List<Actors> actors;

	public MyGame() {
		super("MyGame");
	}

	@Override
	public void render(GameContainer arg0, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		for (Actors a : actors) {
			a.render(g);
		}
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		// TODO Auto-generated method stub
		this.actors = new ArrayList<Actors>();
		MoveStrategy ms1 = new RightStrategy(10, 50);
		MoveStrategy ms2 = new RightStrategy(10, 70);
		
		RectActor ra1 = new RectActor(ms1);
		RectActor ra2 = new RectActor(ms2);
		actors.add(ra1);
		actors.add(ra2);
	}

	@Override
	public void update(GameContainer arg0, int delta) throws SlickException {
		// TODO Auto-generated method stub
		for (Actors a : actors) {
			a.move();
		}
	}

	/**
	 * Entry point to our test
	 * 
	 * @param argv
	 *            The arguments to pass into the test
	 */
	public static void main(String[] argv) {
		try {
			AppGameContainer container = new AppGameContainer(new MyGame());
			container.setDisplayMode(800, 600, false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
