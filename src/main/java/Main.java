import mail.*;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Bohdan", 18, Sex.MALE, "bohdan.mahometa@ucu.edu.ua");
        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(new MailInfo(client, MailCode.GREETINGS));
        mailBox.sendAll();
    }
}
