package at.bals.games.platterns.main;

import java.util.Random;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class CarActor implements Actor{
	private Image image;
	private int x, y;

	public CarActor() throws SlickException {
		this.image = new Image("testdata/car.jpg");
		this.x = 0;

		Random r = new Random();
		this.y = r.nextInt(500);
	}

	public void move(int delta) {
		this.x++;
		if (this.x>=800){
			this.x=0;
		}
	}

	public void paint(Graphics g) {
		g.drawImage(this.image, x, y);
	}
}
