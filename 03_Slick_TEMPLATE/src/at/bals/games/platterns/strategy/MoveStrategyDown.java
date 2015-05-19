package at.bals.games.platterns.strategy;

public class MoveStrategyDown extends AbstractMoveStrategy {
	
	public MoveStrategyDown(int x, int y) {
		super(x, y);
	}

	@Override
	public void move(int delta) {
		this.x++;
		if (this.x == 800) {
			this.x = 0;
		}
		this.y++;
		if (this.y == 600) {
			this.y = 0;
		}
	}
}
