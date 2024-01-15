package input;

import response.IntegerQuestion;

import java.util.Scanner;

public class IntegerInputListener implements InputListener, IntegerInput {

    protected Scanner scanner;

    protected IntegerQuestion response;

    public IntegerInputListener(Scanner scanner, IntegerQuestion response) {
        this.scanner = scanner;
        this.response = response;
    }

    @Override
    public void beginInput() {
        Integer input = scanner.nextInt();

        this.handleInput(input);
    }

    @Override
    public void handleInput(Integer input) {
        if (this.response.canRespond(input)) {
            this.response.respond();
        }
    }
}
