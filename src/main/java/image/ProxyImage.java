package image;

public class ProxyImage implements Image {
    private RealImage realImage;
    private boolean loaded;
    public ProxyImage(String filename) {
        this.realImage = new RealImage(filename);
        this.loaded = false;
    }
    public void display() {
        if (!loaded) {
            realImage.loadFromDisk();
            loaded = true;
        }
        realImage.display();
    }
}
