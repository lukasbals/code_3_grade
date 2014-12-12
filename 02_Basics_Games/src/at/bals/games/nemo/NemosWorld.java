package at.bals.games.nemo;

import java.awt.Color;

import ch.aplu.jgamegrid.GameGrid;
import ch.aplu.jgamegrid.Location;

public class NemosWorld extends GameGrid {

	public static void main(String[] args) {
		NemosWorld nw = new NemosWorld();
		nw.show();
		nw.doRun();
	}

	public NemosWorld() {
		super(15, 15, 50, Color.RED, "sprites/background.jpg");

		for (int i = 0; i < 15; i++) {
			Tree t1 = new Tree();
			addActor(t1, new Location(i, 0));
		}

		Nemo n1 = new Nemo();
		addActor(n1, new Location(0, 0));

		Nemo n2 = new Nemo();
		addActor(n2, new Location(4, 4));

		Nemo n3 = new Nemo();
		addActor(n3, new Location(1, 1));

		Nemo n4 = new Nemo();
		addActor(n4, new Location(2, 2));

		Nemo n5 = new Nemo();
		addActor(n5, new Location(3, 3));
	}
}
