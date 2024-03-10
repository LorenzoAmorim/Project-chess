package src.application;

import src.boardgame.Board;
import src.boardgame.Position;
import src.chess.ChessMatch;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPices());
    }
}
