package at.bals.games.spaceinvador;

import java.util.ArrayList;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class SpacinvadorWorld extends BasicGame {

	public static final int WIDTH = 750;
	public static final int HEIGHT = 800;

	private MyShip ship;
	private Input input;

	private ArrayList<IShips> shipList;

	public SpacinvadorWorld() {
		super("Spaceinvador ;)");
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		for (IShips i : shipList) {
			i.render(g);
		}

		ship.render(g);
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		// TODO Auto-generated method stub
		this.shipList = new ArrayList<IShips>();

		this.shipList.add(new SpaceShips(50, 10, 0.05));
		this.shipList.add(new SpaceShips(250, 10, 0.05));
		this.shipList.add(new SpaceShips(150, 10, 0.05));
		this.shipList.add(new SpaceShips(350, 10, 0.05));
		this.shipList.add(new SpaceShips(450, 10, 0.05));
		this.shipList.add(new SpaceShips(550, 10, 0.05));
		this.shipList.add(new SpaceShips(650, 10, 0.05));

		this.shipList.add(new SpaceShips(50, 80, 0.08));
		this.shipList.add(new SpaceShips(250, 80, 0.08));
		this.shipList.add(new SpaceShips(150, 80, 0.08));
		this.shipList.add(new SpaceShips(350, 80, 0.08));
		this.shipList.add(new SpaceShips(450, 80, 0.08));
		this.shipList.add(new SpaceShips(550, 80, 0.08));
		this.shipList.add(new SpaceShips(650, 80, 0.08));

		this.ship = new MyShip(0.6);
		this.input = gc.getInput();
	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		// TODO Auto-generated method stub
		for (IShips i : shipList) {
			i.move(delta);
		}

		if (input.isKeyDown(Input.KEY_LEFT)) {
			ship.moveLeft(delta);
		}
		if (input.isKeyDown(Input.KEY_RIGHT)) {
			ship.moveRight(delta);
		}
		if (input.isKeyPressed(Input.KEY_SPACE)) {
			Bomb bomb = new Bomb(((int) ship.getX() + 20), (HEIGHT - 100), 1);
			this.shipList.add(bomb);
		}

	}

	public static void main(String[] argv) {
		try {
			AppGameContainer container = new AppGameContainer(new SpacinvadorWorld());
			container.setDisplayMode(WIDTH, HEIGHT, false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
