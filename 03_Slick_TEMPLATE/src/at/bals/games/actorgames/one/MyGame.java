package at.bals.games.actorgames.one;

import java.util.ArrayList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class MyGame extends BasicGame {
	private ArrayList<BulletActor> actorList;
	private FallActor fa;

	public MyGame() {
		super("MyGame");
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		// g.drawRect(100, 100, 100, 100);
		for (BulletActor ba : actorList) {
			ba.render(g);
		}
		fa.render(g);
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		// TODO Auto-generated method stub
		this.actorList = new ArrayList<BulletActor>();
		BulletActor bullet = new BulletActor(10, 300, 1);
		BulletActor bullet1 = new BulletActor(20, 100, 0.5);
		BulletActor bullet2 = new BulletActor(30, 400, 0.1);
		BulletActor bullet3 = new BulletActor(40, 200, 0.7);
		BulletActor bullet4 = new BulletActor(40, 500, 0.05);
		BulletActor bullet5 = new BulletActor(20, 600, 0.10);

		this.actorList.add(bullet);
		this.actorList.add(bullet1);
		this.actorList.add(bullet2);
		this.actorList.add(bullet3);
		this.actorList.add(bullet4);
		this.actorList.add(bullet5);

		this.fa = new FallActor(100, 10, 0.5);
	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		// TODO Auto-generated method stub
		for (BulletActor ba : actorList) {
			ba.move(delta);
		}
		fa.move(delta);
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
