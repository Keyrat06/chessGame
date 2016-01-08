package board;


import java.util.Arrays;
import java.util.List;

public class Helper {
	

    public static final List<Integer> Knight = Arrays.asList(
    		1,
    		2,
    		2,
    		1,
    		-1,
    		-2,
    		-2,
    		-1 		
    );
    
    public static final List<Integer> Bishop = Arrays.asList(
    		1,
    		1,
    		-1,
    		-1
    );
    
    public static final List<Integer> Castle = Arrays.asList(
    		1,
    		0,
    		-1,
    		0
    );
    
    public static final List<Integer> King = Arrays.asList(
    		0,
    		1,
    		1,
    		1,
    		0,
    		-1,
    		-1,
    		-1
    );
    
	
	
	/**
	 * @return a standard Chess Starting Board
	 */
	public static Piece[][] standardBoard(){
		Piece[][] standardBoard = new Piece[8][8];
		for(int i = 0; i<8; i++){
			for(int j = 0; j<8; j++){
				standardBoard[i][j] = Piece.No_Piece;
			}
		}
		//Adding Castles
		standardBoard[0][0] = Piece.White_Castle;
		standardBoard[7][0] = Piece.White_Castle;
		standardBoard[0][7] = Piece.Black_Castle;
		standardBoard[7][7] = Piece.Black_Castle;
		//Adding Knights
		standardBoard[1][0] = Piece.White_Knight;
		standardBoard[6][0] = Piece.White_Knight;
		standardBoard[1][7] = Piece.Black_Knight;
		standardBoard[6][7] = Piece.Black_Knight;
		//Adding Bishops
		standardBoard[2][0] = Piece.White_Bishop;
		standardBoard[5][0] = Piece.White_Bishop;
		standardBoard[2][7] = Piece.Black_Bishop;
		standardBoard[5][7] = Piece.Black_Bishop;
		//Adding Queens
		standardBoard[3][0] = Piece.White_Queen;
		standardBoard[3][7] = Piece.Black_Queen;
		//Adding Kings
		standardBoard[4][0] = Piece.White_King;
		standardBoard[3][7] = Piece.Black_King;
		//Adding Ponds
		for(int i = 0; i < 8; i++){
			standardBoard[i][1] = Piece.White_Pond;
			standardBoard[i][6] = Piece.Black_Pond;
		}
		return standardBoard;
	}
	
	public static boolean isWhitePiece(Piece piece){
		if(piece.equals(Piece.White_Pond) ||
				piece.equals(Piece.White_Castle) ||
				piece.equals(Piece.White_Knight) ||
				piece.equals(Piece.White_Bishop) ||
				piece.equals(Piece.White_Queen) ||
				piece.equals(Piece.White_King)){
			return true;
		}
		return false;
	}
	
	public static boolean sameColor(Piece piece1,Piece piece2){
		return isWhitePiece(piece1) == isWhitePiece(piece2); 
	}

}
