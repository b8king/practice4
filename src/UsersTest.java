import java.util.ArrayList;

class UsersTest {

    static ArrayList<Message> messages = new ArrayList<>();
    static ArrayList<User> user = new ArrayList<>();
    Admin admin = new Admin();
    Moder moder = new Moder();
    Client client = new Client();
    String name;
    String password;
    int id;

    @org.junit.jupiter.api.Test
    void reg(){
        Admin admin = new Admin();
        admin.setName(name);
        admin.setPassword(password);
        admin.setId(id);
        user.add(admin);

        Moder moder = new Moder();
        moder.setName(name);
        moder.setPassword(password);
        moder.setId(id);
        user.add(moder);

        Client client = new Client();
        client.setName(name);
        client.setPassword(password);
        client.setId(id);
        user.add(client);
    }
    @org.junit.jupiter.api.Test
    void addUser(){
        admin.addClient(1, "Ivan", "qwerty", user);
        admin.createModer(user,1);
    }
    @org.junit.jupiter.api.Test
    void message(){
        admin.writeMessage(1, "тест", "добавления ", 1, Main.message);
        moder.writeMessage(2, "тест", "добавления ", 2, Main.message);
        client.writeMessage(3, "тест", "добавления ", 3, Main.message);

        admin.editMessage(1, Main.message, "Редактирование сообщения");
        moder.editMessage(2, Main.message, "Редактирование сообщения");
        client.editMessage(3, Main.message, "Редактирование сообщения");

        admin.delMessage(1,messages,user,1);
        moder.delMessage(2,messages,user,2);
        moder.delMessage(3,messages,user,3);
    }
    @org.junit.jupiter.api.Test
    void delUser(){
        admin.addClient(1, "Ivan", "qwerty", user);
        admin.delClient(1,user);
    }
}
