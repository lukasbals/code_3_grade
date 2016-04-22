package at.bals.patterns.moveStategy;

public abstract class AbstractMoveStrategy implements MoveStrategy {
	protected int x, y;
	
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return this.x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return this.y;
	}
}
