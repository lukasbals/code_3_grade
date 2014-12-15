package at.bals.swing.chat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;

import java.awt.GridLayout;
import java.awt.FlowLayout;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.JTextArea;

import org.omg.CORBA.PUBLIC_MEMBER;
import java.awt.event.KeyAdapter;

public class MainChat extends JFrame {

	private Coder coder;
	private String input;
	private JPanel contentPane;
	private JTextArea inputArea;
	private JTextArea outputArea;
	private JTextArea coderOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainChat frame = new MainChat();
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
	public MainChat() {
		this.coder = new Coder();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel mainPanel = new JPanel();
		contentPane.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel lblInput = new JPanel();
		mainPanel.add(lblInput);
		lblInput.setLayout(null);

		inputArea = new JTextArea();
		inputArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String input = inputArea.getText();
				outputArea.setText(input);

				coderOutput.setText(coder.turn(input));
			}
		});
		inputArea.setBounds(6, 36, 208, 61);
		lblInput.add(inputArea);

		JLabel inputHeading = new JLabel("Input");
		inputHeading.setBounds(6, 8, 61, 16);
		lblInput.add(inputHeading);

		JPanel lblOutput = new JPanel();
		mainPanel.add(lblOutput);
		lblOutput.setLayout(null);

		outputArea = new JTextArea();
		outputArea.setBounds(6, 36, 208, 61);
		lblOutput.add(outputArea);

		JLabel lblOutput_1 = new JLabel("Output");
		lblOutput_1.setBounds(6, 8, 61, 16);
		lblOutput.add(lblOutput_1);

		JPanel lblHeading = new JPanel();
		mainPanel.add(lblHeading);
		lblHeading.setLayout(null);

		JLabel lblCoded = new JLabel("Coded text -->");
		lblCoded.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		lblCoded.setBounds(6, 6, 208, 104);
		lblHeading.add(lblCoded);

		JPanel lblTextChange = new JPanel();
		mainPanel.add(lblTextChange);
		lblTextChange.setLayout(null);

		coderOutput = new JTextArea();
		coderOutput.setBounds(6, 6, 208, 104);
		lblTextChange.add(coderOutput);

		JPanel lblHeader = new JPanel();
		contentPane.add(lblHeader, BorderLayout.NORTH);

		JLabel Heading = new JLabel("Chating Extrem Pro ");
		Heading.setFont(new Font("Seravek", Font.BOLD | Font.ITALIC, 20));
		lblHeader.add(Heading);

		JPanel lblMade = new JPanel();
		contentPane.add(lblMade, BorderLayout.SOUTH);

		JLabel Ground = new JLabel("made by Bals");
		lblMade.add(Ground);
	}
}
