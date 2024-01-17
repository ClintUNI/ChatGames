package tictactoe;

class TicTacToeConsoleUI implements Observer {
    private TicTacToeGame game;

    public TicTacToeConsoleUI(TicTacToeGame game) {
        this.game = game;
        game.addObserver(this);
    }

    @Override
    public void update() {
        displayBoard();
        checkGameStatus();
    }

    private void displayBoard() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                game.getBoard()[i][j].display();
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
        System.out.println();
    }

    private void checkGameStatus() {
        if (checkWin()) {
            System.out.println("Player " + game.getCurrentPlayer() + " wins!");
            System.exit(0);
        } else if (checkTie()) {
            System.out.println("It's a tie!");
            System.exit(0);
        }
    }

    private boolean checkWin() {
        return checkRows() || checkColumns() || checkDiagonals();
    }

    private boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(game.getBoard()[i][0], game.getBoard()[i][1], game.getBoard()[i][2])) {
                System.out.println("Rows won");
                return true;
            }
        }
        return false;
    }

    private boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(game.getBoard()[0][i], game.getBoard()[1][i], game.getBoard()[2][i])) {
                System.out.println("Columns won");
                return true;
            }
        }
        return false;
    }

    private boolean checkDiagonals() {
        return (checkRowCol(game.getBoard()[0][0], game.getBoard()[1][1], game.getBoard()[2][2]) ||
                checkRowCol(game.getBoard()[0][2], game.getBoard()[1][1], game.getBoard()[2][0]));
    }

    private boolean checkRowCol(Cell c1, Cell c2, Cell c3) {
        return (c1 instanceof XCell || c1 instanceof OCell) && c1.equals(c2) && c2.equals(c3);
    }

    private boolean checkTie() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (game.getBoard()[i][j] instanceof EmptyCell) {
                    return false;
                }
            }
        }

        System.out.println("It's a tie!");
        System.exit(0);
        return true;
    }
}

