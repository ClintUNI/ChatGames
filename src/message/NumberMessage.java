package message;

public class NumberMessage implements NumberMessageAdapter {
    private NumberMessage() {}

    @Override
    public ConsoleMessage convertToString(Number number) {
        return new ConsoleMessage(number.toString());
    }
}
