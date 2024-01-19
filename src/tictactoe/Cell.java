package tictactoe;

public class Cell implements Component {
    private char content;

    public Cell(char content) {
        this.content = content;
    }

    @Override
    public void display() {
        System.out.print(" " + content + " ");
    }
}

