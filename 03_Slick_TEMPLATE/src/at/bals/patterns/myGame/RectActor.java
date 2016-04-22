package at.bals.patterns.myGame;

import org.newdawn.slick.Graphics;

import at.bals.patterns.moveStategy.MoveStrategy;

public class RectActor extends AbstractActors {

	public RectActor(MoveStrategy ms) {
		super();
		this.moveStrategy = ms;
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawRect(moveStrategy.getX(), moveStrategy.getY(), 10, 10);
	}

}
