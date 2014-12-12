package at.ran.games.state;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class RocketScreen extends BasicGameState {
	private final static int ID = 2;
	private StateBasedGame game;
	private Rocket rocket;

	@Override
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		this.rocket = new Rocket();
		this.game = game;

	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString("Game started", 200, 10);
		this.rocket.draw(g);

	}

	@Override
	public void update(GameContainer arg0, StateBasedGame game, int delta) throws SlickException {
		
		
		this.rocket.update(delta);
		
		

	}

	@Override
	public int getID() {

		return ID;
	}

}
