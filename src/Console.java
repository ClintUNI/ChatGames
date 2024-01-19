import message.ConsoleMessage;

import java.util.Scanner;

public class Console {

    private final Scanner scanner;

    public Console() {
        this.scanner = ScannerSingleton.create();
    }

    public String readLine() {
        return this.scanner.nextLine();
    }

    public Integer readNumber() {
        return this.scanner.nextInt();
    }

    public String readNumberAsString() {
        return String.valueOf(this.readNumber());
    }

    public String readLine(ConsoleMessage prompt) {
        prompt.sendMessage();
        return this.readLine();
    }

    public Integer readNumber(ConsoleMessage prompt) {
        prompt.sendMessage();
        return this.scanner.nextInt();
    }

    public String readNumberAsString(ConsoleMessage prompt) {
        return String.valueOf(this.readNumber(prompt));
    }

    public void sendLine(ConsoleMessage message) {
        message.sendMessage();
    }

    public boolean matchInput(String input, String match) {
        int matchNumber = input.toUpperCase().indexOf(match.toUpperCase());
        return matchNumber >= 0;
    }

    public MatchInputResults matchInput(String input, String[] matchList) {
        boolean listMatches = false;
        String matchedWord = null;

        for (String stringToMatch : matchList) {
            listMatches = this.matchInput(input, stringToMatch);
            if (listMatches) {
                matchedWord = stringToMatch;
                break;
            }
        }

        return new MatchInputResults(listMatches, matchedWord);
    }
}
