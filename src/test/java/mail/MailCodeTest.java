package mail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailCodeTest {
    MailCode mailCode1;
    MailCode mailCode2;
    String expected1 = "Happy birthday, %NAME%\n" +
            "You're now %AGE%!\n";
    String expected2 = "Hello, %NAME%!\n";
    @BeforeEach
    void setUp() {
        mailCode1 = MailCode.HAPPY_BIRTHDAY;
        mailCode2 = MailCode.GREETINGS;
    }

    @Test
    void generateTemplate() {
        assertEquals(expected1, mailCode1.generateTemplate());
        assertEquals(expected2, mailCode2.generateTemplate());
    }
}