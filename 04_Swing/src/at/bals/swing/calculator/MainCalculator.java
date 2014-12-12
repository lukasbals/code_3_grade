package at.bals.swing.calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.util.Currency;

import javax.swing.DefaultComboBoxModel;

public class MainCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField inputfield;
	private JTextField outputString;
	private JComboBox comboBox;
	private Converter cc;
	private JLabel lblOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainCalculator frame = new MainCalculator();
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
	public MainCalculator() {
		this.cc = new Converter();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel mainPanel = new JPanel();
		contentPane.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new BorderLayout(0, 0));

		JPanel content = new JPanel();
		content.setToolTipText("hallo");
		mainPanel.add(content, BorderLayout.CENTER);
		content.setLayout(new BorderLayout(0, 0));

		inputfield = new JTextField();
		content.add(inputfield, BorderLayout.WEST);
		inputfield.setColumns(10);

		outputString = new JTextField();
		outputString.setEnabled(false);
		outputString.setEditable(false);
		content.add(outputString, BorderLayout.EAST);
		outputString.setColumns(10);

		JPanel inAndOutput = new JPanel();
		content.add(inAndOutput, BorderLayout.NORTH);
		inAndOutput.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblNewLabel = new JLabel("  input (\u20AC)");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		inAndOutput.add(lblNewLabel);

		lblOutput = new JLabel("output  ");
		lblOutput.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblOutput.setHorizontalAlignment(SwingConstants.RIGHT);
		inAndOutput.add(lblOutput);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "(choose)", Converter.DOLLAR, Converter.FRANCS }));
		content.add(comboBox, BorderLayout.CENTER);

		JButton button = new JButton("converte");
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String input = inputfield.getText();
				String currency = (String) comboBox.getSelectedItem();

				int in;
				try {
					in = Integer.parseInt(input);
					double res = cc.convert(in, currency);
					outputString.setText("" + res);
					inputfield.setBackground(Color.white);
				} catch (NumberFormatException e2) {
					// TODO: handle exception
					inputfield.setBackground(Color.red);
					// input.setText("only numbers ...");
				}
			}
		});
		content.add(button, BorderLayout.SOUTH);

		JLabel lblCalculator = new JLabel("Calculator");
		lblCalculator.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
		lblCalculator.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblCalculator, BorderLayout.NORTH);
	}
}
