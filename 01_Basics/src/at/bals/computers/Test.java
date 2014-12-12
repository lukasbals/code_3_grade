package at.bals.computers;

import at.bals.semples.oo.Tractor;

public class Test {
	public static void main(String[] args) {
		
		CPU cpu1 = new CPU("intel", 2900);
		
		iMac m1 = new iMac("Apple", 1299, cpu1);
		
		
		System.out.println(m1);
	}
}
