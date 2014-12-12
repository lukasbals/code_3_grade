package at.bals.swing.chat;

public class Coder {

	public String turn(String input) {
		char[] cArr = input.toCharArray();
		char[] nArr = new char[cArr.length];

		for (int i = 0; i < nArr.length; i++) {
			int index = nArr.length - 1 - i;
			nArr[i] = cArr[index];
		}

		return String.valueOf(nArr);
	}
}
