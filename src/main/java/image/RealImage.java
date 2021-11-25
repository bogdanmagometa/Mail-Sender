package image;

import lombok.Getter;

public class RealImage implements Image {
    @Getter
    private String filename;
    public RealImage(String filename) {
        this.filename = filename;
    }
    public void display() {
        System.out.println("Displaying image");
    }
    public void loadFromDisk() {
        System.out.println("Loading image from " + filename);
    }
}
