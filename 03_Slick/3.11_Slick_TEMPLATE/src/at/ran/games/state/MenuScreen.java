package at.ran.games.state;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MenuScreen extends BasicGameState {
	private StateBasedGame game;

	@Override
	public void init(GameContainer arg0, StateBasedGame game) throws SlickException {
		this.game = game;

	}

	@Override
	public void render(GameContainer arg0, StateBasedGame game, Graphics arg2) throws SlickException {
		arg2.drawString("Press a Key to start...", 300, 300);
		

	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void keyReleased(int key, char c) {
		game.enterState(2);
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 1;
	}

}
