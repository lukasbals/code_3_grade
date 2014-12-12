package at.bals.games.spaceinvador;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import at.bals.games.nemo.Tree;
import ch.aplu.jgamegrid.Actor;
import ch.aplu.jgamegrid.GGKeyListener;

public class Ship extends Actor implements GGKeyListener {
	private int x = 0;

	public Ship() {
		super("sprites/spaceship.gif");
	}

	@Override
	public boolean keyPressed(KeyEvent key) {
		int k = (key.getKeyCode());

		System.out.println(key.getKeyCode());
		System.out.println("pressed");

		if (k == 37) {
			setDirection(180);
			doMove();
		} else {
			if (k == 39) {
				setDirection(0);
				doMove();
			}
		}
		if (k == 32) {
			Bomb bomb = new Bomb();
			gameGrid.addActor(bomb, getLocation());
			gameGrid.playSound("wav/gun.wav");
		}
		return false;
	}

	public void doMove() {
		if (isMoveValid()) {
			move();
		}
	}

	@Override
	public boolean keyReleased(KeyEvent key) {
		System.out.println(key.getKeyCode());
		System.out.println("released");
		return false;
	}

}
