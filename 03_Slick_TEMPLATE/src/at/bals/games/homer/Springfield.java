package at.bals.games.homer;

import javax.crypto.spec.GCMParameterSpec;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Springfield extends BasicGame {

	private Homer homer;
	private Input input;

	public Springfield() {
		super("Welcome to Springfield");
	}

	public void render(GameContainer gc, Graphics g) throws SlickException {

		homer.render(g);
	}

	public void init(GameContainer gc) throws SlickException {
		this.homer = new Homer();
		this.input = gc.getInput();

	}

	public void update(GameContainer gc, int delta) throws SlickException {
		if (input.isKeyDown(Input.KEY_DOWN)) {
			homer.moveDown(delta);
		}
		if (input.isKeyDown(Input.KEY_LEFT)) {
			homer.moveLeft(delta);
		}
		if (input.isKeyDown(Input.KEY_RIGHT)) {
			homer.moveRight(delta);
		}
		if (input.isKeyDown(Input.KEY_UP)) {
			homer.moveUp(delta);
		}
	}

	public static void main(String[] argv) {
		try {
			AppGameContainer container = new AppGameContainer(new Springfield());
			container.setDisplayMode(1000, 800, false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

}
