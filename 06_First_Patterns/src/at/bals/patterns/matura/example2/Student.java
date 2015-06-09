package at.bals.patterns.matura.example2;

public class Student extends APersons {
	protected int studentNum;

	public Student(String name, int studentNum) {
		super(name);
		this.studentNum = studentNum;
	}

	public int getStudentNum() {
		return this.studentNum;
	}

	@Override
	public void inform() {
		// TODO Auto-generated method stub
	}
}
