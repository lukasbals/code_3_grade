package at.bals.games.platterns.main;

import java.util.ArrayList;
import java.util.List;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class MyGame extends BasicGame {
	private List<Actor> actors;

	public MyGame(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		for (Actor a : actors) {
			a.paint(g);
		}
		
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		this.actors = new ArrayList<Actor>();
		for (int i = 0; i < 10; i++) {
			this.actors.add(new CarActor());
			this.actors.add(new TruckActor());
		}
	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		// TODO Auto-generated method stub
		for (Actor a : actors) {
			a.move(delta);
		}
		
	}

	public static void main(String[] args) {
		try {
			AppGameContainer container = new AppGameContainer(new MyGame(
					"Supergailsgame"));
			container.setDisplayMode(800, 600, false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
