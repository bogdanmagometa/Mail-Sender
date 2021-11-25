package image;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealImageTest {
    RealImage realImage;

    @BeforeEach
    void setUp() {
        realImage = new RealImage("image.jpg");
    }

    @Test
    void display() {
        realImage.display();
    }

    @Test
    void loadFromDisk() {
        realImage.loadFromDisk();
    }

    @Test
    void getFilename() {
        assertEquals("image.jpg", realImage.getFilename());
    }
}