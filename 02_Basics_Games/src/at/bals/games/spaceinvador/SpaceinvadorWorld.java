package at.bals.games.spaceinvador;

import java.awt.Point;

import at.bals.games.nemo.Nemo;
import at.bals.games.nemo.Tree;
import ch.aplu.jgamegrid.GameGrid;
import ch.aplu.jgamegrid.Location;

import java.awt.event.KeyEvent;

public class SpaceinvadorWorld extends GameGrid {

	public static void main(String[] args) {
		SpaceinvadorWorld nw = new SpaceinvadorWorld();
		nw.show();
		nw.doRun();

	}

	private int cnt = 0;

	public SpaceinvadorWorld() {
		super(15, 15, 50, "sprites/background.jpg");

		Alien();
		Ship();
		Bomb();

		playSound("wav/groove.wav");
	}

	public void Alien() {
		for (int i = 0; i < 15; i++) {
			Alien a1 = new Alien();
			addActor(a1, new Location(i, 0));
		}
		for (int x = 0; x < 15; x++) {
			Alien a2 = new Alien();
			addActor(a2, new Location(x, 1));
		}
		for (int x = 0; x < 15; x++) {
			Alien a2 = new Alien();
			addActor(a2, new Location(x, 2));
		}
		for (int x = 0; x < 15; x++) {
			Alien a2 = new Alien();
			addActor(a2, new Location(x, 3));
		}
	}

	public void Ship() {
		Ship s1 = new Ship();
		addActor(s1, new Location(5, 14));
		addKeyListener(s1);

	}

	@Override
	public void act() {
		getBg().clear();
		getBg().drawText("Points:" + cnt, new Point(20, 700));
		cnt++;
	}

	public void Bomb() {
		Bomb b2 = new Bomb();
		addActor(b2, new Location(5, 14));
	}
}
