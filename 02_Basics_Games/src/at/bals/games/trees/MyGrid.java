package at.bals.games.trees;

import java.awt.Color;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;

import ch.aplu.jgamegrid.GameGrid;
import ch.aplu.jgamegrid.Location;

public class MyGrid extends GameGrid {

	public MyGrid() {
		super(10, 10, 60, Color.BLUE);

		// doFirst();

		// doSecond();

		// doThird();

		doFourth();
	}

	public void doFirst() {
		for (int y = 0; y < 10; y = y + 9) {
			for (int i = 0; i < 11; i++) {
				Tree t1 = new Tree();
				addActor(t1, new Location(i, y));
			}
		}
		for (int y = 0; y < 10; y = y + 9) {
			for (int i = 0; i < 11; i++) {
				Tree t1 = new Tree();
				addActor(t1, new Location(y, i));
			}
		}
	}

	public void doSecond() {
		for (int y = 0; y < 10; y = y + 2) {
			for (int i = 0; i < 11; i++) {
				Tree t1 = new Tree();
				addActor(t1, new Location(i, y));
			}
		}
	}

	public void doThird() {
		for (int y = 0; y < 10; y = y + 3) {
			for (int i = 0; i < 11; i++) {
				Tree t1 = new Tree();
				addActor(t1, new Location(y, i));
			}
		}
	}

	public void doFourth() {
		for (int y = 0; y < 10; y = y + 9) {
			for (int i = 0; i < 11; i = i + 2) {
				Tree t1 = new Tree();
				addActor(t1, new Location(i, y));
			}
		}
		for (int o = 0; o < 10; o = o + 9) {
			for (int c = 0; c < 11; c = c + 2) {
				Tree t1 = new Tree();
				addActor(t1, new Location(o, c));
			}
		}
	}
}
