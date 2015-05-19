package at.bals.games.platterns.main;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import at.bals.games.platterns.strategy.MoveStrategy;

public class PlaneActor extends AActor{
	private Image image;

	public PlaneActor(MoveStrategy moveStrategy) throws SlickException {
		super(moveStrategy);
		this.image = new Image("testdata/plane.png");
	}

	public void paint(Graphics g) {
		g.drawImage(this.image, moveStrategy.getX(), moveStrategy.getY());
	}
}
