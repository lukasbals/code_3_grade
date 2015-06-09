package at.bals.patterns.matura.example2;


public abstract class APersons implements IPersons {
	protected String name;

	public APersons(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
