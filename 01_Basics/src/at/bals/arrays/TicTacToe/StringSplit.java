package at.bals.arrays.TicTacToe;

public class StringSplit {
	public static void main(String[] args) {
		String str = "1 2";

		String[] strArr = str.split(" ");
		try {
			int num1 = Integer.parseInt(strArr[0]);
			int num2 = Integer.parseInt(strArr[1]);

			System.out.println("num1: " + num1);
			System.out.println("num2: " + num2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Eingabe falsch, es müssen zwei Zahlen sein");
		}
	}
}
