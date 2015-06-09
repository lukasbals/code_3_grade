package at.bals.patterns.matura.example2;

public class Controller {
	public static void main(String[] args) {
		Parent p1 = new Parent("Bals");
		System.out.println(p1.getName());

		Student s1 = new Student("Sieber", 4);
		System.out.println("Name: " + s1.getName() + " Nummer: " + s1.getStudentNum());

		Teacher t1 = new Teacher("Riedmann", 7);
		System.out.println("Name: " + t1.getName() + " Nummer: " + t1.getServiceNum());
	}
}
