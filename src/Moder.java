import java.util.ArrayList;

public class Moder implements User {
    String name;
    String password;
    int id;

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id=id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public void setPassword(String password) {
        this.password=password;
    }
    @Override
    public void writeMessage(int id_message, String mes, String text, int id_client, ArrayList<Message> messages) {
        Message message = new Message();
        message.setId_message(id_message);
        message.setMes(mes);
        message.setText(text);
        message.setId_client(id_client);
        messages.add(message);
    }
    @Override
    public void editMessage(int id_message, ArrayList<Message> messages, String text) {
        for (int i = 0; i < messages.size(); i++) {
            messages.get(i).setId_message(id_message);
            if (messages.get(i).getId_message() == id_message) {
                messages.get(i).setText(text);
            }
        }
    }
    @Override
    public void delMessage(int id_message, ArrayList<Message> messages, ArrayList<User> user, int id_client) {
        for (int i = 0; i < messages.size(); i++) {
            for (int j = 0; j < user.size(); j++) {
                if (user.get(j).getId() == id_client) {
                    if (messages.get(i).getId_message() == id_message) {
                        messages.remove(messages.get(i));
                    }
                }
            }
        }
    }
    public void del_Message_client(ArrayList<Message> messages , int id_message){
        for (int i=0; i<messages.size(); i++) {
            if(messages.get(i).getId_message()==id_message) {
                messages.remove(messages.get(i));
            }
        }
    }
}
