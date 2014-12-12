package at.bals.games.selfmade;

import ch.aplu.jgamegrid.Actor;
import ch.aplu.jgamegrid.Location;

public class Stone extends Actor {
	private boolean isWalking = false;
	private int playerNr;
	private boolean stonehit = false;
	private int nb;

	public int getCx() {
		return cx;
	}

	public void setCx(int cx) {
		this.cx = cx;
	}

	public int getCy() {
		return cy;
	}

	public void setCy(int cy) {
		this.cy = cy;
	}

	private int cx;
	private int cy;

	// private int eight = 8;

	public Stone(int nr) {
		super("sprites/token.png", 2);
		this.playerNr = nr;
		if (playerNr == 1) {
			showNextSprite();
		}
		
		

	}

	public void act() {
		setDirection(90);

		Actor s1 = gameGrid.getOneActorAt(new Location(getLocation().getX(),
				getLocation().getY() + 1), Stone.class);

		// System.out.println("das ist s1: " + s1);
		if (s1 != null) {
			nb = 0;
			stonehit = true;
			// System.out.println("das ist y " + getLocation().getY());
		} else {
			if (isMoveValid() && stonehit == false) {
				move();
				
			}
		}

	}

	public void doMove() {
		if (isMoveValid()) {
			move();
		} else {
			cy = (getY());
			setCy(cy);
		}
	}

	public int getPlayerNr() {
		return playerNr;
	}

	public void setPlayerNr(int playerNr) {
		this.playerNr = playerNr;
	}
}
