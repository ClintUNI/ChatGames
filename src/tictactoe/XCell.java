package tictactoe;

// Leaf class (individual cell)
public class XCell extends Cell {
    public XCell() {
        super('X');
    }

    @Override
    public void display() {
        System.out.print("x");
    }
}