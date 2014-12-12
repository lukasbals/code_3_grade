package at.bals.games.nemo;

import ch.aplu.jgamegrid.Actor;

public class Tree extends Actor {

	public Tree() {
		super("sprites/bild.png");
		
	}

	@Override
	protected void initStart() {
		// TODO Auto-generated method stub
		turn(90);
	}
	
	
	@Override
	public void act() {
		if (nbCycles % 70 ==0){
			show();
		}
		
		if (nbCycles % 10 == 0) {
			if (isInGrid()) {
				move();
			} else {
				turn(180);
				move();
			}
		}
	}
}
