package at.bals.games.platterns.main;

import java.util.ArrayList;
import java.util.List;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import at.bals.games.platterns.strategy.MoveStrategy;
import at.bals.games.platterns.strategy.MoveStrategyDown;
import at.bals.games.platterns.strategy.MoveStrategySinus;
import at.bals.games.platterns.strategy.MoveStrategyStraight;
import at.bals.games.platterns.strategy.MoveStrategyUp;

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

		MoveStrategy msD1 = new MoveStrategyDown(0, 0);
		MoveStrategy msU1 = new MoveStrategyUp(0, 600);
		MoveStrategy msD2 = new MoveStrategyDown(400, 0);
		MoveStrategy msU2 = new MoveStrategyUp(400, 600);
		MoveStrategy msS1 = new MoveStrategySinus(0, 100);

		CarActor ca = new CarActor(msD1);
		this.actors.add(ca);

		ca = new CarActor(msU1);
		this.actors.add(ca);

		ca = new CarActor(msD2);
		this.actors.add(ca);

		ca = new CarActor(msU2);
		this.actors.add(ca);

		ca = new CarActor(msS1);
		this.actors.add(ca);

		MoveStrategy msS2 = new MoveStrategySinus(100, 150);

		TruckActor ta = new TruckActor(msS2);
		this.actors.add(ta);

		MoveStrategy msSt1 = new MoveStrategyStraight(50, 50);

		PlaneActor pa = new PlaneActor(msSt1);
		this.actors.add(pa);
		
		this.actors.add(new DisplayActor());
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
