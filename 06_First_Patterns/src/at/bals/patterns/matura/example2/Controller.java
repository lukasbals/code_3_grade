package at.bals.patterns.matura.example2;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	List<IObserver> observers;

	public Controller() {
		observers = new ArrayList<>();
	}

	public void addObserver(IObserver observer) {
		this.observers.add(observer);
	}

	public void doBuzzer() {
		for (IObserver o : observers) {
			o.inform();
		}
	}

	public static void main(String[] args) {
		Controller c = new Controller();

		Parent p1 = new Parent("Bals");

		Student s1 = new Student("Sieber", 4);

		Student s2 = new Student("Sutterlüty", 32);

		Student s3 = new Student("Libiseller", 21);

		Teacher t1 = new Teacher("Riedmann", 7);

		c.addObserver(p1);
		c.addObserver(t1);
		c.addObserver(s2);
		c.doBuzzer();
	}
}
