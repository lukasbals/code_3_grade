package at.bals.semples.oo;

public class Test {

	public static void main(String[] args) {
		
		Motor m1 = new Motor(70,6);
		Motor m2 = new Motor(100,8);
	
		
		
		//
		// // TODO Auto-generated method stub
		// Vehicle v1 = new Vehicle(4,"blue",90);
		// v1.setAmountTires(4);
		// v1.setColor("gelb");
		//
		// // System.out.println(v1.getAmountTires() + ":" + v1.getColor());

		// Car c1 = new Car(0, null, 0, m1);
		// c1.setAmountTires(4);
		// c1.setColor("schwarz");
		// c1.setSpeed(180);
		// c1.setHasABS(false);

		// System.out.println(c1.isHasABS());

		Tractor t1 = new Tractor(8, "green", 50, m2);
		t1.setAmountTires(4);
		t1.setCableWinch(false);
		t1.setSnowShovel(false);
		t1.bschuett();

		System.out.println("hab ich eine schneeschaufel:" + t1.isSnowShovel());

	}
}
