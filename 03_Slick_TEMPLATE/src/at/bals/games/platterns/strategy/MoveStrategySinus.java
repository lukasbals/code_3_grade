package at.bals.games.platterns.strategy;

public class MoveStrategySinus extends AbstractMoveStrategy {
	private int delta;

	private static final int SPEED = 6;
	private static final int APPLITUDE = 200;
	private static final int FREQUENZ = 70;
	private static final int SHIFT = 200;

	public MoveStrategySinus(int x, int y) {
		super(x, y);
		this.delta = 0;
	}

	@Override
	public void move(int delta) {
		// TODO Auto-generated method stub
		this.delta = this.delta + delta;
		this.x = (int) (double) (this.delta / SPEED);
		this.y = (int) (APPLITUDE * Math.sin((double) this.x / FREQUENZ))
				+ SHIFT;
		if (this.x >= 800) {
			this.x = 0;
			this.delta = 0;
		}
	}
}
