package at.bals.patterns.matura.example2;

public class Teacher extends APersons {
	protected int serviceNum;

	public Teacher(String name, int serviceNum) {
		super(name);
		this.serviceNum = serviceNum;
	}

	public int getServiceNum() {
		return this.serviceNum;
	}

	@Override
	public void inform() {
		// TODO Auto-generated method stub
	}
}