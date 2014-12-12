package at.bals.swing.basics1;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyWindow mw = new MyWindow();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
