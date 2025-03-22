package acme;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
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

        if (minutes % 2 == 0) {
            return minutes;
        } else {
            throw new IllegalStateException(String.format("Minutes is invalid because odd (minutes=%d)", minutes));
        }
    }

    private static int getSeconds() throws IOException {
        int seconds = LocalDateTime.now().getSecond();

        log.info("Step 3: seconds={}", seconds);

        if (seconds % 2 == 0) {
            return seconds;
        } else {
            throw new IOException(String.format("Seconds is invalid because odd (seconds=%d)", seconds));
        }
    }

    public static void main(String[] args) {
        try {
            log.info("Starting...");

            int sum = 0;

            sum += getHours();
            sum += getMinutes();
            sum += getSeconds();

            log.info("Done: sum={}", sum);

            System.exit(0);
        } catch (Exception e) {
            log.error("Calculation error", e);

            System.exit(1);
        }
    }
}
