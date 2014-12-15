package at.bals.games.collision;

import at.bals.games.nemo.Tree;
import ch.aplu.jgamegrid.Actor;
import ch.aplu.jgamegrid.GGActorCollisionListener;
import ch.aplu.jgamegrid.GameGrid;
import ch.aplu.jgamegrid.Location;

public class Grid extends GameGrid implements GGActorCollisionListener {

	public static void main(String[] args) {
		Grid g = new Grid();
		g.show();
	}

	public Grid() {
		super(50, 50, 15);
		init();

		Fish f = new Fish();
		Tree t = new Tree();
		
		
		addActor(t, new Location(5, 5));
		addActor(f, new Location(5, 15));

		f.addActorCollisionListener(this);
		f.addCollisionActor(t);

	}

	private void init() {
		show();
		doRun();
		setSimulationPeriod(30);
	}

	@Override
	public int collide(Actor arg0, Actor arg1) {
		System.out.println("Collison");
		return 0;
	}
}