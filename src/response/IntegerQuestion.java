package response;

import java.util.Objects;

public class IntegerQuestion extends ResponseMessage {

    private Integer requiredInputMessage;

    public IntegerQuestion(Integer requiredInputMessage, String responseMessage) {
        this.setRequiredInputMessage(requiredInputMessage);
        this.setResponse(responseMessage);
    }

    protected void setRequiredInputMessage(Integer inputMessage) {
        this.requiredInputMessage = inputMessage;
    }

    public Integer getRequiredInputMessage() {
        return this.requiredInputMessage;
    }

    public Boolean canRespond(Integer input) {
        return Objects.equals(input, this.getRequiredInputMessage());
    }

    public void handleInput(Integer input) {
        if (this.canRespond(input)) {
            this.respond();
        }
    }
}
