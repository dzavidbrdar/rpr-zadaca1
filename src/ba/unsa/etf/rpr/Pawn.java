package ba.unsa.etf.rpr;

public class Pawn extends ChessPiece {

    protected boolean legalForThatKindOfPiece(String position) {
        position = position.toUpperCase();
        if (ChessPiece.numberCoordinate(position) == ChessPiece.numberCoordinate(this.position))
            return false;
        if (Math.abs(ChessPiece.letterCoordinate(position) - ChessPiece.letterCoordinate(this.position)) > 1)
            return false;
        if (Math.abs(ChessPiece.numberCoordinate(position) - ChessPiece.numberCoordinate(this.position)) > 2)
            return false;
        if ((ChessPiece.numberCoordinate(this.position) == 4 || ChessPiece.numberCoordinate(this.position) == 5)
                && (Math.abs(ChessPiece.numberCoordinate(position)
                - ChessPiece.numberCoordinate(this.position)) > 1))
            return false;
        if (Math.abs(ChessPiece.numberCoordinate(position) - ChessPiece.numberCoordinate(this.position)) == 2
                && Math.abs(ChessPiece.letterCoordinate(position) - ChessPiece.letterCoordinate(this.position)) > 0)
            return false;
        if (getColor() == Color.WHITE
                && ChessPiece.numberCoordinate(position) < ChessPiece.numberCoordinate(this.position))
            return false;
        if (getColor() == Color.BLACK
                && ChessPiece.numberCoordinate(position) > ChessPiece.numberCoordinate(this.position))
            return false;
        return true;
    }

    public Pawn(String position, ChessPiece.Color color) {
        super(position, color);
    }
}
