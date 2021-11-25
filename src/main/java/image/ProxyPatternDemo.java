package image;

public class ProxyPatternDemo {
    static String imgFile = "./image.jpg";
    public static void main(String[] args) {
        System.out.println("Initializing proxy:\n--------------------");
        Image image = new ProxyImage(imgFile);
        System.out.println("Displaying image with proxy 10 times:\n------------------------------");
        for (int i = 0; i < 10; i++) {
            image.display();
        }
    }
}
