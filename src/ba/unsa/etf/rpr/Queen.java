package ba.unsa.etf.rpr;

public class Queen extends ChessPiece {

    protected boolean legalForThatKindOfPiece(String position) {
        position = position.toUpperCase();
        if ((Math.abs(ChessPiece.letterCoordinate(position) - ChessPiece.letterCoordinate(this.position)) != 0) &&
                (Math.abs(ChessPiece.numberCoordinate(position) - ChessPiece.numberCoordinate(this.position)) != 0) &&
                (Math.abs(ChessPiece.letterCoordinate(position) - ChessPiece.letterCoordinate(this.position)) !=
                Math.abs(ChessPiece.numberCoordinate(position) - ChessPiece.numberCoordinate(this.position))))
            return false;
        return true;
    }

    public Queen(String position, ChessPiece.Color color) {
        super(position, color);
    }
}
