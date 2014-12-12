package at.lukas.basics;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");

		for (int i = 0; i < 16; i++) {
			System.out.println("I am number " + i);
		}
		
		//Zähle von 20 nach 0 rückwärts
		
		for (int i = 20; i >= 0; i--) {
			System.out.println("I am number " + i);
		}
		
		//Berechne die Summer der Zahlen von 7 bis 21
		
		int sum=0;
		
		for (int i = 7; i < 22; i++) {
			sum = sum + i;
		}
		
		System.out.println("I am number " + sum);
		
		//Berechne den Mittelwrt der Zahlen von 121 bis 139
		
		int sim=0;
		int durchlauf=0;
		int result=0;
		
		for (int i = 121; i < 140; i++) {
			sim = sim + i;
			durchlauf=durchlauf + 1;
		}
		result = sim / durchlauf;
		System.out.println("I am number " + result);
		//System.out.println(durchlauf);
	}

}
