package acme;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);

    private static int getHours() {
        int hours = LocalDateTime.now().getHour();

        log.info("Step 1: hours={}", hours);

        return hours;
    }

    private static int getMinutes() {
        int minutes = LocalDateTime.now().getMinute();

        log.info("Step 2: minutes={}", minutes);

        return minutes;
    }

    private static int getSeconds() {
        int seconds = LocalDateTime.now().getSecond();

        log.info("Step 3: seconds={}", seconds);

        return seconds;
    }

    public static void main(String[] args) {
        log.info("Starting...");

        int sum = 0;

        sum += getHours();
        sum += getMinutes();
        sum += getSeconds();

        log.info("Done: sum={}", sum);
    }
}
