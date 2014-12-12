package at.bals.arrays.basics;

public class ArrayTest {
	private static int a;
	
	public static void main(String[] args) {
		
		
		
		int[] aArr = new int[5];

		for (int i = 0; i < aArr.length; i++) {
			aArr[i] = (i * 10) + 10;
		}
		
		for(int i =0;i<aArr.length;i++){
			System.out.println(aArr[i]);
			
		}
		for(int i =0;i<aArr.length;i++){
			a = a + aArr[i];
			
		}
		System.out.println("SUMME=" + a);

		// System.out.println(aArr[3]);
		
	}
}
