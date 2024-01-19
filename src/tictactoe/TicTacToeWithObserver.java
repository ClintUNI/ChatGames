package tictactoe;

import java.util.Scanner;

public class TicTacToeWithObserver {
    public static void main(String[] args) {
        CellFactory cellFactory = new CellFactory(); 
        TicTacToeGame game = new TicTacToeGame(cellFactory);
        TicTacToeConsoleUI consoleUI = new TicTacToeConsoleUI(game);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int row, col;
            System.out.println("Player " + game.getCurrentPlayer() + "'s turn");
            System.out.print("Enter row and column (e.g., 0 0): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            game.makeMove(row, col);
        }
    }
}



