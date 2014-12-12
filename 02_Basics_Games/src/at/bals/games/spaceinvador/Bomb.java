package at.bals.games.spaceinvador;

import ch.aplu.jgamegrid.Actor;

public class Bomb extends Actor {
	private boolean hasTurned = false;

	public Bomb() {
		super("sprites/bomb.gif");

	}

	public void act() {
		turn();
		explosion();
	}

	private void explosion() {
		Actor a = gameGrid.getOneActorAt(getLocation(), Alien.class);
		if (a != null) {
			a.removeSelf();

			Explosion ex = new Explosion();
			gameGrid.addActor(ex, getLocation());
			gameGrid.playSound("wav/explosion.wav");

			this.removeSelf();
		} else {
			move();
		}
	}

	private void turn() {
		if (!hasTurned) {
			turn(-90);
			hasTurned = true;
		}
	}
}