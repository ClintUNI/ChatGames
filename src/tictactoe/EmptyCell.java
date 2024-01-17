package tictactoe;

public class EmptyCell implements Cell {
    @Override
    public void display() {
        System.out.print(" ");
    }
}
