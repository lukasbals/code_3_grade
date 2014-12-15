package at.bals.swing.guibuilder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EchoMachine extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;
	private JButton btnScream;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EchoMachine frame = new EchoMachine();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EchoMachine() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel mainPanel = new JPanel();
		mainPanel.setBorder(new TitledBorder(null, "The Echo Machine", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new BorderLayout(0, 0));

		JPanel tellMe = new JPanel();
		mainPanel.add(tellMe, BorderLayout.NORTH);
		tellMe.setLayout(new BorderLayout(0, 0));

		JLabel lblTellMe = new JLabel("Tell me ...");
		tellMe.add(lblTellMe, BorderLayout.CENTER);

		textField = new JTextField();
		tellMe.add(textField, BorderLayout.EAST);
		textField.setColumns(10);

		JPanel output = new JPanel();
		mainPanel.add(output, BorderLayout.CENTER);
		output.setLayout(new BorderLayout(0, 0));

		textArea = new JTextArea();
		output.add(textArea);

		JPanel panel = new JPanel();
		mainPanel.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));

		btnScream = new JButton("Scream");
		btnScream.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("do it");

				String old = textArea.getText();
				old = old + "\n";
				old = old + textField.getText();

				textField.setText("");

				textArea.setText(old);
				// textArea.setBackground(Color.red);
			}
		});
		panel.add(btnScream, BorderLayout.CENTER);
	}

}
