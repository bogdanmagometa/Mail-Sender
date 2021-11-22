package mail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    Client client = new Client("John", 24, Sex.MALE, "john@google.com");
    MailInfo mailInfo;
    MailCode mailCode = MailCode.HAPPY_BIRTHDAY;
    String expectedText = "Happy birthday, John\n" +
            "You're now 24!\n";
    @BeforeEach
    void setUp() {
        mailInfo = new MailInfo(client, mailCode);
    }

    @Test
    void generateText() {
        assertEquals(expectedText, mailInfo.generateText());
    }

    @Test
    void getEmail() {
        assertEquals("john@google.com", mailInfo.getEmail());
    }

    @Test
    void getClient() {
        assertEquals(client, mailInfo.getClient());
    }

    @Test
    void getMailCode() {
        assertEquals(mailCode, mailInfo.getMailCode());
    }
}