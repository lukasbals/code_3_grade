package at.bals.games.platterns.strategy;

public class MoveStrategyStraight extends AbstractMoveStrategy {
	public MoveStrategyStraight(int x, int y) {
		super(x, y);
	}

	public void move(int delta) {
		this.x++;
		if (this.x == 800) {
			this.x = 0;
		}
	}
}
