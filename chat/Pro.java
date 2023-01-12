package chat;

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

// class PrivateChat implements Chatroom {

// @Override
// public void sendMessage(String msg, User user) {
// // TODO Auto-generated method stub

// }

// @Override
// public void appendClient(User user) {
// // TODO Auto-generated method stub

// }

// @Override
// public void editingMessage(String msg, User user, String textNew) {
// // TODO Auto-generated method stub

// }
