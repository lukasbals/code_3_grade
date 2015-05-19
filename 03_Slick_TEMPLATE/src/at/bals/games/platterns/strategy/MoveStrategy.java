package at.bals.games.platterns.strategy;

public interface MoveStrategy {
	public void move(int delta);
	public int getX();
	public int getY();
}
