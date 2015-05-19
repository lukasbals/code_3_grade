package at.bals.games.platterns.strategy;

public abstract class AbstractMoveStrategy implements MoveStrategy {
	protected int x, y;

	public AbstractMoveStrategy(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
