package at.bals.games.platterns.main;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import at.bals.games.platterns.strategy.MoveStrategy;

public class CarActor extends AActor {
	private Image image;

	public CarActor(MoveStrategy moveStrategy) throws SlickException {
		super(moveStrategy);
		this.image = new Image("testdata/car.jpg");
	}

	public void paint(Graphics g) {
		g.drawImage(this.image, moveStrategy.getX(), moveStrategy.getY());
	}
}
