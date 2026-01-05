package realizationInterfaces;

import interfaces.Logger;

import java.time.LocalDateTime;

public class SimpleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("[" + LocalDateTime.now() + "]" + " " + message);
    }
}
