import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class FrameOne {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JButton b2;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameOne window = new FrameOne();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrameOne() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ImageIcon iconLogo = new ImageIcon("src/board.png");
		
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(200, 200, 600, 600);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Khalil\\Desktop\\chessProject\\chessGame\\JavaGuiDemo\\src\\board.png"));
		frame.getContentPane().add(lblNewLabel);
		
		JButton b1 = new JButton("");
		b1.setBounds(200, 200, 200, 200);
		frame.getContentPane().add(b1);
		
		b2 = new JButton("");
		b2.setBounds(400, 200, 200, 200);
		frame.getContentPane().add(b2);
		
		button = new JButton("");
		button.setBounds(600, 200, 200, 200);
		frame.getContentPane().add(button);
	}
}
