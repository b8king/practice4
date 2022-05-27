
import java.util.ArrayList;

public interface User {
    int getId();
    void setId(int id);
    String getName();
    void setName(String name);
    String getPassword();
    void setPassword(String password);
    void writeMessage(int id_message, String mes, String text, int id_client, ArrayList<Message> messages);
    void editMessage(int id_message, ArrayList<Message> messages, String text);
    void delMessage(int id_message, ArrayList<Message> messages, ArrayList<User> user, int id_client);
}