package at.bals.games.platterns.main;

import org.newdawn.slick.Graphics;

public class DisplayActor implements Actor{
	private int points;

	public void increment(){
		this.points++;
	}
	
	@Override
	public void move(int delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawString("Points: " + points, 350, 10);
	}	
}
