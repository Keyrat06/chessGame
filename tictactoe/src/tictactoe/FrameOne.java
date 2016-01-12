package tictactoe;
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
import java.awt.Color;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class FrameOne {

	private Board gameBoard;
	private JFrame frame;
	private JLabel lblNewLabel;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JLabel Message;
	private JButton Reset;
	
	
	
//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FrameOne window = new FrameOne(new Board());
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public FrameOne(Board gameBoard) {
		this.gameBoard = gameBoard;
		initialize();
		frame.setVisible(true);
	}
	
	private void winCheck(){
		if(gameBoard.getWinner().equals("X")){
			Message.setText("X Wins!");
		}
		else if(gameBoard.getWinner().equals("O")){
			Message.setText("O Wins!");
		}
		else if(gameBoard.getWinner().equals("Tie")){
			Message.setText("It is a Tie!");
		}
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int output = gameBoard.move(0, 0);
				if(output == 1){b1.setText("X");}
				else if(output == 2){b1.setText("O");}
				winCheck();
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 99));
		b1.setOpaque(false);
		b1.setContentAreaFilled(false);
		b1.setBorderPainted(false);
		b1.setBounds(200, 200, 200, 200);
		frame.getContentPane().add(b1);
		
		b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int output = gameBoard.move(1, 0);
				if(output == 1){b2.setText("X");}
				else if(output == 2){b2.setText("O");}
				winCheck();
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 99));
		b2.setOpaque(false);
		b2.setContentAreaFilled(false);
		b2.setBorderPainted(false);
		b2.setBounds(400, 200, 200, 200);
		frame.getContentPane().add(b2);
		
		b3 = new JButton("");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int output = gameBoard.move(2, 0);
				if(output == 1){b3.setText("X");}
				else if(output == 2){b3.setText("O");}
				winCheck();
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 99));
		b3.setOpaque(false);
		b3.setContentAreaFilled(false);
		b3.setBorderPainted(false);
		b3.setBounds(600, 200, 200, 200);
		frame.getContentPane().add(b3);
		
		b4 = new JButton("");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int output = gameBoard.move(0, 1);
				if(output == 1){b4.setText("X");}
				else if(output == 2){b4.setText("O");}
				winCheck();
			}
		});
		b4.setFont(new Font("Tahoma", Font.BOLD, 99));
		b4.setOpaque(false);
		b4.setContentAreaFilled(false);
		b4.setBorderPainted(false);
		b4.setBounds(200, 400, 200, 200);
		frame.getContentPane().add(b4);
		
		b5 = new JButton("");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int output = gameBoard.move(1, 1);
				if(output == 1){b5.setText("X");}
				else if(output == 2){b5.setText("O");}
				winCheck();
			}
		});
		b5.setFont(new Font("Tahoma", Font.BOLD, 99));
		b5.setOpaque(false);
		b5.setContentAreaFilled(false);
		b5.setBorderPainted(false);
		b5.setBounds(400, 400, 200, 200);
		frame.getContentPane().add(b5);
		
		b6 = new JButton("");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int output = gameBoard.move(2, 1);
				if(output == 1){b6.setText("X");}
				else if(output == 2){b6.setText("O");}
				winCheck();
			}
		});
		b6.setFont(new Font("Tahoma", Font.BOLD, 99));
		b6.setOpaque(false);
		b6.setContentAreaFilled(false);
		b6.setBorderPainted(false);
		b6.setBounds(600, 400, 200, 200);
		frame.getContentPane().add(b6);
		
		b7 = new JButton("");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int output = gameBoard.move(0, 2);
				if(output == 1){b7.setText("X");}
				else if(output == 2){b7.setText("O");}
				winCheck();
			}
		});
		b7.setFont(new Font("Tahoma", Font.BOLD, 99));
		b7.setOpaque(false);
		b7.setContentAreaFilled(false);
		b7.setBorderPainted(false);
		b7.setBounds(200, 600, 200, 200);
		frame.getContentPane().add(b7);
		
		b8 = new JButton("");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int output = gameBoard.move(1, 2);
				if(output == 1){b8.setText("X");}
				else if(output == 2){b8.setText("O");}
				winCheck();
			}
		});
		b8.setFont(new Font("Tahoma", Font.BOLD, 99));
		b8.setOpaque(false);
		b8.setContentAreaFilled(false);
		b8.setBorderPainted(false);
		b8.setBounds(400, 600, 200, 200);
		frame.getContentPane().add(b8);
		
		b9 = new JButton("");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int output = gameBoard.move(2, 2);
				if(output == 1){b9.setText("X");}
				else if(output == 2){b9.setText("O");}
				winCheck();
			}
		});
		b9.setFont(new Font("Tahoma", Font.BOLD, 99));
		b9.setOpaque(false);
		b9.setContentAreaFilled(false);
		b9.setBorderPainted(false);
		b9.setBounds(600, 600, 200, 200);
		frame.getContentPane().add(b9);
		
		
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(200, 200, 600, 600);
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/board.png")));
		frame.getContentPane().add(lblNewLabel);
		
		Message = new JLabel("");
		Message.setFont(new Font("Tahoma", Font.BOLD, 36));
		Message.setHorizontalAlignment(SwingConstants.CENTER);
		Message.setBounds(200, 59, 600, 82);
		frame.getContentPane().add(Message);
		
		Reset = new JButton("Reset Game");
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b1.setText("");
				b2.setText("");
				b3.setText("");
				b4.setText("");
				b5.setText("");
				b6.setText("");
				b7.setText("");
				b8.setText("");
				b9.setText("");
				gameBoard.Reset();
				Message.setText("");
			}
		});
		Reset.setBounds(400, 839, 200, 69);
		frame.getContentPane().add(Reset);
	}
	
	
	
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
