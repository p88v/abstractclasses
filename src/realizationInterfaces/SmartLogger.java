package realizationInterfaces;

import interfaces.Logger;

import java.time.LocalDateTime;
import java.util.Locale;

public class SmartLogger implements Logger {

    int cnt = 1;

    @Override
    public void log(String message) {
        System.out.println("INFO#" + cnt + " " + "[" + LocalDateTime.now() + "]" + " " + message);
        cnt++;
    }
}
