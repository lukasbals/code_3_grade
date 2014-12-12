package at.lukas.basics;

public class WhileLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Heeee Jungs");

		int sum = 21;

		while (sum > 0) {
			sum = sum - 1;
			System.out.println("I am number " + sum);
		}

		sum = 0;
		int count = 0;
		int i = 7;

		while (i <= 21) {
			sum = sum + i; 
			count++;
			
			i++;
		}
		double result = sum/count;
		System.out.println("sum:" + sum + " avg:" + result);
	}

}
