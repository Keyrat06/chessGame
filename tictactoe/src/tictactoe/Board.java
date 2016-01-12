package tictactoe;

import java.util.Arrays;
import java.util.List;

public class Board{
	private tac[][] board = new tac[3][3];
	private boolean xturn = true;
	private String winner = "None";
	
	
	public Board() {
		for (int j = 0; j<3; j++) {
			for (int i = 0; i<3; i++) {
				board[i][j] = tac.notac;
			}
		}
	}
	
	/**
	 * updates the current board state for the game. the top left block is 0,0 and bottom right block is 3,3
	 * @param x the x position of the block to move at
	 * @param y the y position of the block to move at 
	 * @return 0 if no one moved, 1 if x moved and 2 if O moved.
	 */
	public int move (int x, int y) {
		if(winner.equals("None")){
			int turn = 0;
			if (board[x][y].equals(tac.notac)){
				if (xturn) {
					board[x][y] = tac.xtac;
					turn = 1;
				
				}
				else {
					board[x][y] = tac.otac;
					turn = 2;
				}
				xturn = !xturn;
			}
			
			if (board[0][0].equals(tac.xtac) && board[0][1].equals(tac.xtac) && board[0][2].equals(tac.xtac)) {
				winner = "X";	
			}
			if (board[1][0].equals(tac.xtac) && board[1][1].equals(tac.xtac) && board[1][2].equals(tac.xtac)) {
				winner = "X";	
			}
			if (board[2][0].equals(tac.xtac) && board[2][1].equals(tac.xtac) && board[2][2].equals(tac.xtac)) {
				winner = "X";	
			}
			if (board[0][0].equals(tac.xtac) && board[1][0].equals(tac.xtac) && board[2][0].equals(tac.xtac)) {
				winner = "X";	
			}
			if (board[0][1].equals(tac.xtac) && board[1][1].equals(tac.xtac) && board[2][1].equals(tac.xtac)) {
				winner = "X";;	
			}
			if (board[0][2].equals(tac.xtac) && board[1][2].equals(tac.xtac) && board[2][2].equals(tac.xtac)) {
				winner = "X";;	
			}
			if (board[0][0].equals(tac.xtac) && board[1][1].equals(tac.xtac) && board[2][2].equals(tac.xtac)) {
				winner = "X";	
			}
			if (board[2][0].equals(tac.xtac) && board[1][1].equals(tac.xtac) && board[0][2].equals(tac.xtac)) {
				winner = "X";	
			}
			
			
			if (board[0][0].equals(tac.otac) && board[0][1].equals(tac.otac) && board[0][2].equals(tac.otac)) {
				winner = "O";	
			}
			if (board[1][0].equals(tac.otac) && board[1][1].equals(tac.otac) && board[1][2].equals(tac.otac)) {
				winner = "O";	
			}
			if (board[2][0].equals(tac.otac) && board[2][1].equals(tac.otac) && board[2][2].equals(tac.otac)) {
				winner = "O";	
			}
			if (board[0][0].equals(tac.otac) && board[1][0].equals(tac.otac) && board[2][0].equals(tac.otac)) {
				winner = "O";	
			}
			if (board[0][1].equals(tac.otac) && board[1][1].equals(tac.otac) && board[2][1].equals(tac.otac)) {
				winner = "O";	
			}
			if (board[0][2].equals(tac.otac) && board[1][2].equals(tac.otac) && board[2][2].equals(tac.otac)) {
				winner = "O";	
			}
			if (board[0][0].equals(tac.otac) && board[1][1].equals(tac.otac) && board[2][2].equals(tac.otac)) {
				winner = "O";	
			}
			if (board[2][0].equals(tac.otac) && board[1][1].equals(tac.otac) && board[0][2].equals(tac.otac)) {
				winner = "O";	
			}
			boolean allFull = true;
			for (int j = 0; j<3; j++) {
				for (int i = 0; i<3; i++) {
					if(board[i][j].equals(tac.notac)){
						allFull = false;
					}
				}
			}
			if (allFull){
				winner = "Tie";
			}
			return turn;
		}
		else{
			return 0;
		}
	}

	
	public String getWinner(){
		return winner;
	}
	
	/**
	 * resets the gameboard
	 */
	public void Reset(){
		for (int j = 0; j<3; j++) {
			for (int i = 0; i<3; i++) {
				board[i][j] = tac.notac;
			}
		}
		xturn = true;
		winner = "None";
	}
	
	/**
	 * prints out a veiwable version of the board
	 * @return
	 */
	public String viewBoard(){
		String output = "";
		for (int j = 0; j<3; j++) {
			for (int i = 0; i<3; i++) {
				if (board[i][j].equals(tac.notac)){
					output += " ";
				}
				else if (board[i][j].equals(tac.otac)){
					output += "O";
				}
				else if (board[i][j].equals(tac.xtac)){
					output += "X";
				}
			}
			output += "\n";
		}
		return output;
	}

	
}
