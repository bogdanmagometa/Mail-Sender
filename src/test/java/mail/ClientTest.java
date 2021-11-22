package mail;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    Client prevClient;
    Client client;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        prevClient = new Client("some", 23, Sex.FEMALE, "das@yahoo.com");
        client = new Client("Jim", 20, Sex.FEMALE, "jim@google.com");
    }

    @org.junit.jupiter.api.Test
    void getId() {
        assertNotEquals(prevClient.getId(), client.getId());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Jim", client.getName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals(20, client.getAge());
    }

    @org.junit.jupiter.api.Test
    void getSex() {
        assertEquals(Sex.FEMALE, client.getSex());
    }

    @org.junit.jupiter.api.Test
    void getEmail() {
        assertEquals("jim@google.com", client.getEmail());
    }
}