package mail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MailBoxTest {
    MailBox mailBox;
    Client client = new Client("Jack", 17, Sex.MALE, "jack@google.com");
    MailCode mailCode = MailCode.GREETINGS;
    MailInfo mailInfo;
    @BeforeEach
    void setUp() {
        mailInfo = new MailInfo(client, mailCode);
        mailBox = new MailBox();
    }
    @Test
    void addMailInfo() {
        mailBox.addMailInfo(mailInfo);
    }
}