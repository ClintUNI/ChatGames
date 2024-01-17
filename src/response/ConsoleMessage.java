package response;

public abstract class ConsoleMessage implements Message {

    private String responseMessage;

    public void setMessage(String message) {
        this.responseMessage = message;
    }

    @Override
    public String getMessage() {
        return this.responseMessage;
    }

    @Override
    public void sendMessage() {
        System.out.println(this.getMessage());
    }
}
