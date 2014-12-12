package at.bals.games.actorgames.two;

import java.util.ArrayList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class MyGame extends BasicGame {
	private ArrayList<Actor> actorList;

	public MyGame() {
		super("Interfaces");
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		for (Actor a : actorList) {
			a.render(g);
		}
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		// TODO Auto-generated method stub
		this.actorList = new ArrayList<Actor>();

		this.actorList.add(new FallActor(100, 10, 0.1));
		this.actorList.add(new FallActor(125, 10, 0.125));
		this.actorList.add(new FallActor(150, 10, 0.15));
		this.actorList.add(new FallActor(175, 10, 0.175));
		this.actorList.add(new FallActor(200, 10, 0.2));
		this.actorList.add(new FallActor(225, 10, 0.225));
		this.actorList.add(new FallActor(250, 10, 0.25));
		this.actorList.add(new FallActor(275, 10, 0.275));
		this.actorList.add(new FallActor(300, 10, 0.3));
		this.actorList.add(new FallActor(325, 10, 0.325));
		this.actorList.add(new FallActor(350, 10, 0.35));
		this.actorList.add(new FallActor(375, 10, 0.375));
		this.actorList.add(new FallActor(400, 10, 0.4));
		this.actorList.add(new FallActor(425, 10, 0.425));
		this.actorList.add(new FallActor(450, 10, 0.45));
		this.actorList.add(new FallActor(475, 10, 0.475));
		this.actorList.add(new FallActor(500, 10, 0.5));
		this.actorList.add(new FallActor(525, 10, 0.525));
		this.actorList.add(new FallActor(550, 10, 0.55));
		this.actorList.add(new FallActor(575, 10, 0.575));
		this.actorList.add(new FallActor(600, 10, 0.6));
		this.actorList.add(new FallActor(625, 10, 0.625));
		this.actorList.add(new FallActor(650, 10, 0.65));
		this.actorList.add(new FallActor(675, 10, 0.675));
		this.actorList.add(new FallActor(700, 10, 0.7));
		this.actorList.add(new FallActor(725, 10, 0.725));
		this.actorList.add(new FallActor(750, 10, 0.75));
		this.actorList.add(new FallActor(775, 10, 0.775));
		this.actorList.add(new FallActor(800, 10, 0.8));
		this.actorList.add(new FallActor(825, 10, 0.825));
		this.actorList.add(new FallActor(850, 10, 0.85));
		this.actorList.add(new FallActor(875, 10, 0.875));
		this.actorList.add(new FallActor(900, 10, 0.9));
	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		// TODO Auto-generated method stub
		for (Actor a : actorList) {
			a.move(delta);
		}
	}

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
