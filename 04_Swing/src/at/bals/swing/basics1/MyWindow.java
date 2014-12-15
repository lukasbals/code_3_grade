package at.bals.swing.basics1;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyWindow extends JFrame {
	public MyWindow() {
		super("My first Window");
		setSize(400, 400);
		setVisible(true);

		JPanel main = new JPanel();
		main.setLayout(new BoxLayout(main, BoxLayout.X_AXIS));
		setContentPane(main);

		// lef Panel
		JPanel leftPanel = new JPanel();
		// leftPanel.setBackground(Color.red);
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		leftPanel.setAlignmentY(JPanel.TOP_ALIGNMENT);

		for (int i = 0; i < 15; i++) {
			JButton b = new JButton("Button " + i);
			leftPanel.add(b);
		}

		// right Panel
		JPanel rightPanel = new JPanel();
		// rightPanel.setBackground(Color.green);
		rightPanel.setLayout(new BorderLayout());

		JTextArea ta = new JTextArea();
		rightPanel.add(ta, BorderLayout.CENTER);

		main.add(leftPanel);
		main.add(rightPanel);

	}
}
