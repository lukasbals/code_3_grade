package at.bals.patterns.myGame;

import at.bals.patterns.moveStategy.MoveStrategy;

public abstract class AbstractActors implements Actors {
	protected int x, y;
	protected MoveStrategy moveStrategy;

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
		this.moveStrategy.move();
	}
}
