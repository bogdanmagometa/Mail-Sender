package mail;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();
    private MailSender mailSender = new MailSender();
    public void addMailInfo(MailInfo info) {
        infos.add(info);
    }
    public void sendAll() {
        for (MailInfo info: infos) {
            mailSender.sendMail(info);
        }
    }
}
