package mail;

import lombok.SneakyThrows;

import java.io.File;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    @SneakyThrows
    public String generateTemplate() {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            sb.append(sc.nextLine());
            sb.append('\n');
        }
        return sb.toString();
    }
}
