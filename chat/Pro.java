import java.util.ArrayList;

public class Pro {

    public static void main(String[] args) {
        Chat gb = new Chat();

        User client1 = new User("Маша", gb);
        User client2 = new User("Вася", gb);
        // User client4 = new User("Вальдемар", gb);

        gb.appendClient(client1);
        gb.appendClient(client2);
        // gb.appendClient(client4);

        client1.sendMsg("Привет всем");

        client2.sendMsg("Ку-ку");
        client2.editingMessage("Ку-ку", "Кукусики");

        // User client3 = new User("Леля", gb);
        // gb.appendClient(client3);

        // client3.sendMsg("hello world!");
    }
}

class User {
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

interface Chatroom {
    void sendMessage(String msg, User user);

    void appendClient(User user);

    void editingMessage(String msg, User user, String textNew);

}

class Chat implements Chatroom {

    ArrayList<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String text, User me) {

        for (User user : users) {
            if (user.name == me.name) {
                user.printMessage(text);
            }
        }
    }

    @Override
    public void appendClient(User client) {
        System.out.println("\n >>> Добавился " + client.name);
        users.add(client);

    }

    @Override
    public void editingMessage(String text, User me, String textNew) {
        for (User user : users) {
            if (user.name == me.name) {
                user.printNewMessage(text, textNew);
            }
        }
    }

}
