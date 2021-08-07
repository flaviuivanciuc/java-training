package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private final Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public Pawn[][] getPieces() {
        return pieces;
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (IsLegalBoardPosition(xCoordinate, yCoordinate)) {
            if (ValidatePositionForColors(xCoordinate, pawn.getPieceColor())) {
                pawn.setChessBoard(this);
                pawn.setXCoordinate(xCoordinate);
                pawn.setYCoordinate(yCoordinate);
                pawn.setPieceColor(pieceColor);
                pieces[xCoordinate][yCoordinate] = pawn;
            } else {
                SetUnavailableCoordinates(pawn);
            }
        } else {
            SetUnavailableCoordinates(pawn);
        }
    }

    private boolean ValidatePositionForColors(int xCoordinate, PieceColor pieceColor) {
        if (pieceColor == PieceColor.WHITE) {
            return xCoordinate == 0 || xCoordinate == 1;
        } else {
            return xCoordinate == MAX_BOARD_WIDTH - 1 || xCoordinate == MAX_BOARD_WIDTH;
        }
    }

    public boolean IsLegalBoardPosition(int newX, int newY) {
        if (newX < Pawn.getXCoordinate() - 1 || newY < Pawn.getYCoordinate() - 1) {
            return false;
        }
        if (AreCoordinatesOfPawnValid(newX, newY))
            return IsPositionFree(newX, newY);
        else
            return false;
    }

    private boolean AreCoordinatesOfPawnValid(int xCoordinate, int yCoordinate) {
        return IsXPositionLegal(xCoordinate) && IsYPositionLegal(yCoordinate);
    }

    private boolean IsXPositionLegal(int xCoordinate) {
        return 0 <= xCoordinate && xCoordinate <= MAX_BOARD_WIDTH;
    }

    private boolean IsYPositionLegal(int yCoordinate) {
        return 0 <= yCoordinate && yCoordinate <= MAX_BOARD_HEIGHT;
    }

    public boolean IsPositionFree(int xCoordinate, int yCoordinate) {
        try {
            if (pieces[xCoordinate][yCoordinate] == null) {
                return true;
            } else {
                return false;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            return false;
        }
    }

    public void SetUnavailableCoordinates(Pawn pawn) {
        pawn.setXCoordinate(-1);
        pawn.setYCoordinate(-1);
    }
}
