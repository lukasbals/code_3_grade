package at.bals.games.actorgames.three;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Mustang implements ICar {

	private Image imgCar;

	private double distance;
	private double x, y;
	private double speed;
	private double tankFuel;

	public Mustang(int x, int y, double speed, double tankFuel) {
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.tankFuel = tankFuel;
		try {
			this.imgCar = new Image("testdata/mustang.png");
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void move(int delta) {
		// TODO Auto-generated method stub
		if (tankFuel > 0) {
			x = x - (delta * speed);
			tankFuel = tankFuel - 0.05;
			distance = distance + (delta * speed);
		}
		if (x < 0) {
			x = 1000;

		}
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		imgCar.draw((int) x, (int) y);
		g.drawString("distance --> " + (int) distance, (int) getX(), (int) y + 170);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}
}
