package at.bals.patterns.matura.example2;

public class Parent extends APersons {
	public Parent(String name) {
		super(name);
	}

	@Override
	public void inform() {
		System.out.println("I am Parent " + name + " and dont have a number");

	}
}
