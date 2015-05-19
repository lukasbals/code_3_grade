package at.bals.games.platterns.main;

import at.bals.games.platterns.strategy.MoveStrategy;

public abstract class AActor implements Actor{
	protected MoveStrategy moveStrategy;
	
	public AActor(MoveStrategy moveStrategy){
		this.moveStrategy = moveStrategy;
	}
	
	public void move(int delta) {
		moveStrategy.move(delta);
	}
}
