package at.bals.games.platterns.strategy;

public class MoveStrategyUp extends AbstractMoveStrategy {

	public MoveStrategyUp(int x, int y) {
		super(x, y);
	}

	public void move(int delta) {
		this.x++;
		if (this.x == 800) {
			this.x = 0;
		}
		this.y--;
		if (this.y == 0) {
			this.y = 600;
		}
	}
}
