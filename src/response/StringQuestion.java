package response;

public class StringQuestion extends ResponseMessage {

    private String requiredInputMessage;

    public StringQuestion(String requiredInputMessage, String responseMessage) {
        this.setRequiredInputMessage(requiredInputMessage);
        this.setResponse(responseMessage);
    }

    protected void setRequiredInputMessage(String inputMessage) {
        this.requiredInputMessage = inputMessage;
    }

    public String getRequiredInputMessage() {
        return this.requiredInputMessage;
    }

    public Boolean canRespond(String input) {
        return this.getRequiredInputMessage().toUpperCase().contains(input.toUpperCase());
    }

    public void handleInput(String input) {
        if (this.canRespond(input)) {
            this.respond();
        }
    }
}
