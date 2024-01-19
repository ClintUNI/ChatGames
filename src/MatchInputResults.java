public class MatchInputResults {

    private final boolean matched;

    private final String matchedString;

    public MatchInputResults(boolean matched, String matchedString) {
        this.matched = matched;
        this.matchedString = matchedString;
    }

    public boolean isMatching() {
        return this.matched;
    }

    public String getMatched() {
        return this.matchedString;
    }

}
