public class Message {
    private String mes;
    private int id_message;
    private String text;
    private int id_client;

    Message()
    {
        this.id_message=(int)Math.random();
    }
    public String getMes()
    {
        return this.mes;
    }
    public void setMes(String mes)
    {
        this.mes = mes;
    }
    public int getId_message()
    {
        return this.id_message;
    }
    public void setId_message(int id_message)
    {
        this.id_message = id_message;
    }
    public String getText()
    {
        return this.text;
    }
    public void setText(String text)
    {
        this.text=text;
    }
    public int getId_client()
    {
        return this.id_client;
    }
    public void setId_client(int id_client)
    {
        this.id_client=id_client;
    }
}
