package at.bals.games.actorgames.three;

import java.util.ArrayList;
import java.util.Random;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Road extends BasicGame {

	private final static int WIDTH = 1000, HEIGHT = 400;

	private Image imgRed;
	private Image imgGreen;

	private ArrayList<ICar> actorList;
	private ArrayList<ICar> rainList;

	private Input input;

	private boolean stopped = false;

	private int count;

	public Road() {
		super("Road");
	}

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		// TODO Auto-generated method stub
		for (ICar ca : actorList) {
			ca.render(g);
		}
		for (ICar rain : rainList) {
			rain.render(g);

		}
		if (stopped == true) {
			imgRed.draw(50, 50);
		} else {
			imgGreen.draw(50, 50);
		}
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		// TODO Auto-generated method stub

		this.input = gc.getInput();
		this.rainList = new ArrayList<ICar>();
		this.actorList = new ArrayList<ICar>();
		this.imgRed = new Image("testdata/ampel_rot.png");
		this.imgGreen = new Image("testdata/ampel_gruen.png");

		setCars();
	}

	private void setCars() {
		this.actorList.add(new Camaro(1000, 50, 0.3, 250.5));
		this.actorList.add(new Mustang(1000, 200, 0.5, 310.4));
	}

	@Override
	public void update(GameContainer gc, int delta) throws SlickException {
		// TODO Auto-generated method stub
		if (count == 55) {
			Random randX = new Random();
			int randomX = randX.nextInt(WIDTH - 50);

			Random randY = new Random();
			int randomY = randY.nextInt(50);

			this.rainList.add(new Drop(randomX, randomY, 0.5));

		}
		if (count == 56) {
			count = 0;
		}
		count++;
		for (ICar rain : rainList) {
			rain.move(delta);
		}

		if (input.isKeyPressed(input.KEY_SPACE)) {
			stopped ^= true;
		}

		if (!stopped) {
			for (ICar ca : actorList) {
				ca.move(delta);
			}
		}
	}

	public static void main(String[] argv) {
		try {
			AppGameContainer container = new AppGameContainer(new Road());
			container.setDisplayMode(WIDTH, HEIGHT, false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}
