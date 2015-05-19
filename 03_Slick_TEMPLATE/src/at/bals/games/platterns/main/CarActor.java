package at.bals.games.platterns.main;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import at.bals.games.platterns.strategy.MoveStrategy;

public class CarActor implements Actor{
	private Image image;
	private MoveStrategy moveStrategy;

	public CarActor() throws SlickException {
		this.image = new Image("testdata/car.jpg");
	}

	public void move(int delta) {
		moveStrategy.move(delta);
	}

	public void paint(Graphics g) {
		g.drawImage(this.image, moveStrategy.getX(), moveStrategy.getY());
	}

	public void setMoveStrategy(MoveStrategy moveStrategy) {
		this.moveStrategy = moveStrategy;
	}
}
