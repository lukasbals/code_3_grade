package at.bals.games.platterns.main;

import java.util.ArrayList;
import java.util.List;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import at.bals.games.platterns.strategy.MoveStrategy;

public class TemperaturActor extends AActor {
	private List<Observer> observers = new ArrayList<Observer>();
	private int tmp;

	public TemperaturActor(MoveStrategy moveStrategy) throws SlickException {
		super(moveStrategy);
	}

	public void addObserver(Observer ta) {
		this.observers.add(ta);
	}

	@Override
	public void paint(Graphics g) {
		g.drawOval(moveStrategy.getX(), moveStrategy.getY(), 50, 50);
		tmp = 600 - this.moveStrategy.getY();
		String tmpString = Integer.toString(tmp);

		g.drawString(tmpString, this.moveStrategy.getX() + 8,
				this.moveStrategy.getY() + 13);

		if (tmp > 500) {
			infromAll();
		}
	}

	private void infromAll() {
		for (Observer o : observers) {
			o.inform();
		}
	}
}
