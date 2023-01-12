package chat;

import java.util.ArrayList;

public class Chat implements Chatroom {

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