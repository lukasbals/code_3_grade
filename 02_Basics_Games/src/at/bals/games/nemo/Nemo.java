package at.bals.games.nemo;

import ch.aplu.jgamegrid.Actor;

public class Nemo extends Actor {
	private int x = 0;

	public Nemo() {
		super(true, "sprites/Nemo.gif");
	}

	@Override
	public void act() {

		System.out.println(getLocation().getX() + " : " + getLocation().getY());

		Actor actor = gameGrid.getOneActorAt(getLocation(), Tree.class);
		if (actor != null) {
			actor.hide();
		}

		if (isMoveValid()) {
			move();
		} else {
			turn(90);
			move();
		}
	}
}
