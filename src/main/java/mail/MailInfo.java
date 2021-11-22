package mail;

import lombok.Getter;

import java.util.HashMap;

public class MailInfo {
    @Getter
    private Client client;
    @Getter
    private MailCode mailCode;
    public MailInfo(Client client, MailCode mailCode) {
        this.client = client;
        this.mailCode = mailCode;
    }
    public String generateText() {
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());
        templates.put("%AGE%", Integer.toString(client.getAge()));

        String text = mailCode.generateTemplate();
        for (String key: templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }
        return text;
    }
    public String getEmail() {
        return client.getEmail();
    }
}
