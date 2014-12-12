package at.bals.games.spaceinvador;

import ch.aplu.jgamegrid.Actor;

public class Explosion extends Actor {
	int cnt = 0;

	public Explosion() {
		super(true, "sprites/explosion.gif", 2);
	}

	@Override
	public void act() {
		// turn(90);
		showNextSprite();
		cnt++;
		if (cnt == 4) {
			this.removeSelf();
		}
	}
}