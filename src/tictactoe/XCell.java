package tictactoe;

public class XCell extends Cell {
    public XCell() {
        super('X');
    }

    @Override
    public void display() {
        System.out.print("x");
    }
}