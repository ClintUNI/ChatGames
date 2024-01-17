package input;

import java.util.Scanner;

public class StringInputListener implements InputListener, StringInput {

    protected Scanner scanner;

    protected ConsolePrompt response;

    public StringInputListener(Scanner scanner, ConsolePrompt response) {
        this.scanner = scanner;
        this.response = response;
    }

    @Override
    public void beginInput() {
        String input = scanner.nextLine();

        this.handleInput(input);
    }

    @Override
    public void handleInput(String input) {
        if (this.response.canRespond(input)) {
            this.response.respond();
        }
    }
}
