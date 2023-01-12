package chat;

public class User {
    String name;
    private Chatroom chatroom;

    public User(String name, Chatroom chatroom) {
        this.name = name;
        this.chatroom = chatroom;
    }

    void printMessage(String msg) {
        System.out.printf(" Всем пользователям %s : %s\n", name, msg);
    }

    void printNewMessage(String msg, String msgNew) {
        System.out.printf(" Всем пользователям: %s изменил(а) свое сообщение %s на %s\n", name, msg, msgNew);
    }

    void sendMsg(String text) {
        chatroom.sendMessage(text, this);
    }

    void editingMessage(String text, String textNew) {
        chatroom.editingMessage(text, this, textNew);
    }
}
