package Challenge_8;

import Challenge_7.Personnage;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void notifierTous(List<Notification> liste, String msg) {
        for (Notification l : liste) {
            l.envoyer(msg);
        }
    }

    public static void main(String[] args) {

        List<Notification> t = new ArrayList<>();
        t.add(new EmailNotification());
        t.add(new SmsNotification());
        t.add(new PushNotification());

        notifierTous(t, "Something");

    }
}
