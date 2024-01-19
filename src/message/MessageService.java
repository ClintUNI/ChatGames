package message;

import java.util.HashMap;

public class MessageService implements Message {

    private HashMap<String, ConsoleMessage>cache;

    public MessageService() {
        this.cache = new HashMap<String, ConsoleMessage>();
    };

    public ConsoleMessage create(String responseMessage) {
        if (this.cache.containsKey(responseMessage)) {
            return this.cache.get(responseMessage);
        } else {
            ConsoleMessage newMessage = new ConsoleMessage(responseMessage);
            this.cache.put(responseMessage, newMessage);
            return newMessage;
        }
    }

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public void sendMessage() {

    }
}
