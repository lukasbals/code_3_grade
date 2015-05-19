package at.bals.games.platterns.strategy;

public class MoveStrategySinus extends AbstractMoveStrategy {
	private int elapsedTime;

	private static final int SPEED = 6;
	private static final int APPLITUDE = 200;
	private static final int FREQUENZ = 70;
	private static final int SHIFT = 200;
	private int startX, startY;

	public MoveStrategySinus(int x, int y) {
		super(x, y);
		this.startX = x;
		this.startY = y;
		this.elapsedTime = 0;
	}

	@Override
	public void move(int delta) {
		// TODO Auto-generated method stub
		this.elapsedTime = this.elapsedTime + delta;
		this.x = (int) (double) (this.elapsedTime / SPEED) + startX;
		this.y = (int) (APPLITUDE * Math.sin((double) this.x / FREQUENZ))
				+ SHIFT + startY;
		if (this.x >= 800) {
			this.x = 0;
			this.elapsedTime = 0;
		}
	}
}
