package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private static int xCoordinate;
    private static int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
    }

    public ChessBoard getChessBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public static int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public static int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    public void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void Move(MovementType movementType, int newX, int newY) {
        Pawn[][] pieces = chessBoard.getPieces();

        int oldX = getXCoordinate();
        int oldY = getYCoordinate();

        if (movementType == MovementType.MOVE) {
            if (getChessBoard().IsLegalBoardPosition(newX, newY)) {
                pieces[oldX][oldY] = null;
                setXCoordinate(newX);
                setYCoordinate(newY);
                pieces[newX][newY] = this;
            }
        }
    }

    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: {1}{0}Current Y: {2}{0}Piece Color: {3}", eol, xCoordinate, yCoordinate, pieceColor);
    }
}
