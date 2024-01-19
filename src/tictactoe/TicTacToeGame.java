package tictactoe;
import java.util.ArrayList;
import java.util.List;

public class TicTacToeGame implements Observable {
    public Component[][] board; 
    private char currentPlayer;
    private List<Observer> observers;
    private CellFactory cellFactory;

    public TicTacToeGame(CellFactory cellFactory) {
        this.cellFactory = cellFactory;
        board = new Component[3][3]; 
        currentPlayer = 'X';
        observers = new ArrayList<>();
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = cellFactory.createCell(' ');
            }
        }
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public Component[][] getBoard() { 
        return board;
    }

    public void makeMove(int row, int col) {
        if (isValidMove(row, col)) {
            board[row][col] = cellFactory.createCell(currentPlayer);
            notifyObservers();
            switchPlayer();
        } else {
            System.out.println("Invalid move. Try again.");
        }
    }

    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] instanceof EmptyCell;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}


