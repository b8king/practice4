import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static ArrayList<Message> message = new ArrayList<>();
    static ArrayList<User> user = new ArrayList<>();

    public static void main(String[] args) {
        Admin admin = new Admin();
        String id, name, pass, id_mess, Message;
        id = "[id]:";
        name = "[Name]:";
        pass = "[Password]:";
        id_mess = "[id message]:";
        Message = "[Message]:";
        admin.addClient(1, "Ivan", "qwerty", user);
        admin.addClient(2, "Alex", "12q3", user);
        admin.addClient(3, "Tom", "d21q5", user);
        System.out.println(id + user.get(0).getId()
                + name + user.get(0).getName()
                + pass + user.get(0).getPassword());

        System.out.println(id + user.get(1).getId()
                + name + user.get(1).getName()
                + pass + user.get(1).getPassword());

        System.out.println(id + user.get(2).getId()
                + name + user.get(2).getName()
                + pass + user.get(2).getPassword());

        admin.writeMessage(1, "тест", "добавления ", 1, message);
        System.out.println(id_mess + message.get(0).getId_message()
                + " text: " + message.get(0).getMes()
                + Message + message.get(0).getText());

        admin.editMessage(1, message, "Редактирование сообщения");
        System.out.println(id_mess + message.get(0).getId_message()
                + Message + message.get(0).getText());

        Client client = new Client();
        client.writeMessage(4, "пользователь", "сообщение пользователя", 2, message);
        System.out.println(id_mess + message.get(1).getId_message()
                + " text: " + message.get(1).getMes()
                + Message + message.get(1).getText()
                + id + message.get(1).getId_client());

        client.writeMessage(5, "пользователь", "сообщение для редактирования", 2, message);
        System.out.println(id_mess + message.get(2).getId_message()
                + " text: " + message.get(2).getMes()
                + Message + message.get(2).getText()
                + id + message.get(1).getId_client());
        client.writeMessage(6, "пользователь", "сообщение для удаления", 1, message);
        System.out.println(id_mess + message.get(3).getId_message()
                + " text: " + message.get(3).getMes()
                + Message + message.get(3).getText()
                + id + message.get(0).getId_client());

        client.editMessage(5, message, "редактирование");
        System.out.println(id_mess + message.get(2).getId_message()
                + Message + message.get(2).getText());

        admin.createModer(user, 1);
        System.out.println("админ добавил нового модератора: " + name
                + user.get(1).getName());
    }
}
