package at.bals.arrays.TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			while (true) {
				String str = br.readLine();
				System.out.println("line: " + str);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("lieber user, es ist ein fehler pssiert...");
		}
	}
}
