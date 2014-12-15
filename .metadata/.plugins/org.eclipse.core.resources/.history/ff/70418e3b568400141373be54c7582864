package at.bals.swing.guibuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class FirstWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtVorname;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow frame = new FirstWindow();
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
	public FirstWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu File = new JMenu("File");
		menuBar.add(File);
		
		JMenuItem newFile = new JMenuItem("new");
		File.add(newFile);
		
		JMenuItem save = new JMenuItem("save");
		File.add(save);
		
		JMenuItem close = new JMenuItem("close");
		File.add(close);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel mainPanel = new JPanel();
		contentPane.add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel left = new JPanel();
		mainPanel.add(left);
		left.setLayout(null);
		
		txtVorname = new JTextField();
		txtVorname.setBounds(92, 6, 122, 28);
		left.add(txtVorname);
		txtVorname.setColumns(10);
		
		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setBounds(6, 12, 61, 16);
		left.add(lblVorname);
		
		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setBounds(6, 40, 79, 16);
		left.add(lblNachname);
		
		textField = new JTextField();
		textField.setBounds(92, 34, 122, 28);
		left.add(textField);
		textField.setColumns(10);
		
		JLabel lblVerheiratet = new JLabel("Geschlecht");
		lblVerheiratet.setBounds(6, 68, 79, 16);
		left.add(lblVerheiratet);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("M");
		chckbxNewCheckBox.setBounds(92, 64, 43, 23);
		left.add(chckbxNewCheckBox);
		
		JCheckBox chckbxF = new JCheckBox("F");
		chckbxF.setBounds(132, 64, 43, 23);
		left.add(chckbxF);
		
		JCheckBox chckbxZ = new JCheckBox("Z");
		chckbxZ.setBounds(171, 64, 43, 23);
		left.add(chckbxZ);
		
		JPanel right = new JPanel();
		mainPanel.add(right);
		right.setLayout(new BoxLayout(right, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		mainPanel.add(panel);
	}
}
