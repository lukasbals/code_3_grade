package at.bals.games.spaceinvador;

import ch.aplu.jgamegrid.Actor;
import ch.aplu.jgamegrid.Location;

public class Alien extends Actor {

	public Alien() {
		super("sprites/alien.gif", 2);
	}

	@Override
	public void act() {
		showNextSprite();

		if (nbCycles % 250 == 0) {
			setDirection(90);
			if (isMoveValid()) {
				move();
			} else {
				GameOver go = new GameOver();
				gameGrid.addActor(go, new Location(7, 7));
				gameGrid.doPause();
				gameGrid.playSound("wav/feelgood.wav");
			}
		}
	}
}
