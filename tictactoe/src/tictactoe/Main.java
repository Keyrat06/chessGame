package tictactoe;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		//Board GameBoard = new Board();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameOne window = new FrameOne(new Board());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
