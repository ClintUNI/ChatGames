package response;

public abstract class ResponseMessage implements Response {

    private String responseMessage;

    public void setResponse(String message) {
        this.responseMessage = message;
    }

    @Override
    public String getResponse() {
        return this.responseMessage;
    }

    @Override
    public void respond() {
        System.out.println(this.getResponse());
    }
}
