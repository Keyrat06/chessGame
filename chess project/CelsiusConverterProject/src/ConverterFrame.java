import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.Canvas;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class ConverterFrame extends JFrame {

	private JLayeredPane contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterFrame frame = new ConverterFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public ConverterFrame() throws IOException {
		setTitle("Celsius Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JLayeredPane();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(21, 15, 124, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Celsius");
		lblNewLabel.setBounds(146, 20, 109, 16);
		contentPane.add(lblNewLabel);
		


		
		JLabel lblNewLabel_1 = new JLabel("Fahrenheit");
		lblNewLabel_1.setBounds(146, 52, 109, 16);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.setBounds(21, 47, 124, 29);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    //Parse degrees Celsius as a double and convert to Fahrenheit.
			    int tempFahr = (int)((Double.parseDouble(textField.getText()))
			            * 1.8 + 32);
			    lblNewLabel_1.setText(tempFahr + " Fahrenheit");
			}
		});
		contentPane.add(btnNewButton);
		
		BufferedImage img = ImageIO.read(new File("CHESS.png"));
		
	}
}
