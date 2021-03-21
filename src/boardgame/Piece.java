package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] matrixOfMoves = possibleMoves();
		
		for(int i = 0; i < matrixOfMoves.length; i++)
			for(int j = 0; j < matrixOfMoves[i].length; j++)
				if(matrixOfMoves[i][j])
					return true;
		return false;
	}

}
