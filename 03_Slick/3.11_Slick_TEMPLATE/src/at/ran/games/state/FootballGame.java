package at.ran.games.state;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class FootballGame extends StateBasedGame {

	public FootballGame(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException {

		addState(new MenuScreen());
		addState(new RocketScreen());

	}
	public static void main(String[] args) {
		   AppGameContainer appgc;
		   try{
		      appgc = new AppGameContainer(new FootballGame("hi"));
		      appgc.setDisplayMode(840, 560, false);
		      appgc.setShowFPS(true);
		      
		      appgc.start();
		   }catch(SlickException e){
		      e.printStackTrace();
		   }
		}

}
