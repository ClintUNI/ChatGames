package tictactoe;

// Leaf class (individual cell)
public class OCell extends Cell {
    public OCell() {
        super('O');
    }

    @Override
    public void display() {
        System.out.print("O");
    }
}
