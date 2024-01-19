package tictactoe;

public class EmptyCell extends Cell {
    public EmptyCell() {
        super(' ');
    }

    @Override
    public void display() {
        System.out.print(" ");
    }
}
