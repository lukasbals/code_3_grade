package at.bals.swing.projekt;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Layout extends JFrame {

	private JPanel contentPane;
	private JTextField masseInput;
	private JTextField streckeInput;
	private JTextField zeitInput;
	private JTextArea geschwindigkeitOutput;
	private JTextArea workOutput;
	private JSlider slider;

	private String inputStrecke;
	private String inputTime;
	private String inputMasse;

	private int outputSpeed;
	private int outputWork;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layout frame = new Layout();
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
	public Layout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		JPanel mainPanel = new JPanel();
		tabbedPane.addTab("Rechner", null, mainPanel, null);
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));

		JPanel speedPanel = new JPanel();
		mainPanel.add(speedPanel);
		speedPanel.setLayout(null);

		JLabel streckeLabel = new JLabel("Strecke: (m)");
		streckeLabel.setBounds(6, 115, 119, 16);
		speedPanel.add(streckeLabel);

		JLabel geschwindigkeitLabel = new JLabel("Geschwindikeit: (m/s)");
		geschwindigkeitLabel.setBounds(6, 6, 173, 16);
		speedPanel.add(geschwindigkeitLabel);

		JLabel zeitLabel = new JLabel("Zeit: (s)");
		zeitLabel.setBounds(6, 171, 61, 16);
		speedPanel.add(zeitLabel);

		geschwindigkeitOutput = new JTextArea();
		geschwindigkeitOutput.setBounds(6, 24, 197, 79);
		speedPanel.add(geschwindigkeitOutput);

		streckeInput = new JTextField();
		streckeInput.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				inputStrecke = streckeInput.getText();
			}
		});
		streckeInput.setBounds(6, 131, 197, 28);
		speedPanel.add(streckeInput);
		streckeInput.setColumns(10);

		zeitInput = new JTextField();
		zeitInput.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				inputTime = zeitInput.getText();
			}
		});
		zeitInput.setBounds(6, 188, 197, 28);
		speedPanel.add(zeitInput);
		zeitInput.setColumns(10);

		JPanel workPanel = new JPanel();
		mainPanel.add(workPanel);
		workPanel.setLayout(null);

		JLabel workLabel = new JLabel("Verrichtete Arbeit: (J)");
		workLabel.setBounds(6, 6, 169, 16);
		workPanel.add(workLabel);

		JLabel masseLabel = new JLabel("Masse: (kg)");
		masseLabel.setBounds(6, 115, 105, 16);
		workPanel.add(masseLabel);

		workOutput = new JTextArea();
		workOutput.setBounds(6, 25, 197, 78);
		workPanel.add(workOutput);

		masseInput = new JTextField();
		masseInput.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				inputMasse = masseInput.getText();
			}
		});
		masseInput.setBounds(6, 131, 197, 28);
		workPanel.add(masseInput);
		masseInput.setColumns(10);

		slider = new JSlider();
		slider.setValue(50);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				masseInput.setText("" + slider.getValue());
			}
		});
		slider.setMinimum(1);
		slider.setBounds(6, 160, 197, 29);
		inputMasse = masseInput.getText();
		workPanel.add(slider);

		JButton converteBottom = new JButton("Converte!");
		converteBottom.addActionListener(new ActionListener() {
			int inTime;
			int inStrecke;
			int inMasse;

			public void actionPerformed(ActionEvent e) {
				inTime = Integer.parseInt(inputTime);
				inStrecke = Integer.parseInt(inputStrecke);
				inMasse = Integer.parseInt(inputMasse);
				System.out.println("masse:" + inputMasse);

				outputSpeed = (inStrecke / inTime);
				// System.out.println(outputSpeed);
				geschwindigkeitOutput.setText("" + outputSpeed);

				outputWork = ((inMasse * outputSpeed) / 2);
				System.out.println(outputWork);
				// workOutput.setText("" + outputWork);
			}
		});
		converteBottom.setBounds(6, 187, 197, 29);
		workPanel.add(converteBottom);

		JPanel ImpressumPanel = new JPanel();
		ImpressumPanel.setToolTipText("");
		tabbedPane.addTab("Impressum", null, ImpressumPanel, null);
		ImpressumPanel.setLayout(new BorderLayout(0, 0));

		JLabel lblMadeByBals = new JLabel("made by Bals");
		lblMadeByBals.setHorizontalAlignment(SwingConstants.CENTER);
		lblMadeByBals.setFont(new Font("Lithos Pro", Font.PLAIN, 22));
		ImpressumPanel.add(lblMadeByBals, BorderLayout.CENTER);
	}
}