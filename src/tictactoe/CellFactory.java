package tictactoe;

public class CellFactory {
    public Cell createCell(char type) {
        switch (type) {
            case 'X':
                return new XCell();
            case 'O':
                return new OCell();
            default:
                return new EmptyCell();
        }
    }
}
