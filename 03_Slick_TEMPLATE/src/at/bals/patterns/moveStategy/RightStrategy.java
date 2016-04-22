package at.bals.patterns.moveStategy;

public class RightStrategy extends AbstractMoveStrategy {
	public RightStrategy(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void move() {
		x++;
		if(this.x == 800){
			this.x=0;
		}
	}
}
