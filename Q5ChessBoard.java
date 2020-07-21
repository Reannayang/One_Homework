/*
@ Chest board generation
@ version 1.0
@ Runan Yang
@ 7/21/2020
*/

public class Q5ChessBoard{

	public static void main(String[] args){

	
		String[] grade = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e","f" };

			
		String[][] ChessBoard = new String[grade.length][grade.length];
		
		for (int i = 0; i < ChessBoard.length; i++) {
            
			for (int j = 0; j < ChessBoard.length; j++) {
                
				ChessBoard[i][j] = "+";
                
				if (j == 0) {
                    
					ChessBoard[i][j] = grade[i];
                }
                
				if (i == 0) {
                    ChessBoard[i][j] = grade[j];
                }
                
				System.out.print(ChessBoard[i][j]+" ");
            }
            
			System.out.println();

	
	
		}
	}
}