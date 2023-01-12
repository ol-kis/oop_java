package chat;

public interface Chatroom {
    void sendMessage(String text, User me);

    void appendClient(User client);

    void editingMessage(String text, User me, String textNew);

}