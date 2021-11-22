package mail;

import lombok.Getter;

public class Client {
    private static int numClients = 0;
    @Getter
    private int id;
    @Getter
    private String name;
    @Getter
    private int age;
    @Getter
    private Sex sex;
    @Getter
    private String email;
    public Client(String name, int age, Sex sex, String email) {
        this.id = numClients;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
        numClients++;
    }
}
