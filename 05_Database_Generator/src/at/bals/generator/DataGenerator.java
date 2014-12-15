package at.bals.generator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class DataGenerator {
	public static void main(String[] args) {
		DataGenerator dg = new DataGenerator();
		dg.printStudentData();
	}

	private void printStudentData() {
		// TODO Auto-generated method stub
		Random r = new Random();
		try {
			FileWriter fw = new FileWriter(
					new File(
							"/Users/lukibals/Documents/HTL 4. Klasse/LA_Ried._Datenbanken/SpielData.sql"));
			for (int i = 1; i < 21; i++) {
				fw.write("INSERT INTO Spieleverwaltung.Spiel (ID, name, fk_spiel_kategorie, fk_spiel_plattform, fk_alter, fk_herteller, fk_kundenbewertung, fk_notenbewertung, 'release', einkauf, verkauf) VALUES ('"
						+ i
						+ "', 'Spielname"
						+ i
						+ "', '"
						+ r.nextInt(10)
						+ "', '"
						+ r.nextInt(10)
						+ "', '"
						+ r.nextInt(10)
						+ "', '"
						+ r.nextInt(10)
						+ "', '"
						+ r.nextInt(10)
						+ "', '"
						+ r.nextInt(10)
						+ "' , '"
						+ r.nextInt(2014)
						+ "."
						+ r.nextInt(10)
						+ "."
						+ r.nextInt(30)
						+ "', '"
						+ r.nextInt(40) + "', '" + r.nextInt(50) + "');");
			}
			fw.flush();
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
