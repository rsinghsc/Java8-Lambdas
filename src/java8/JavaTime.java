package java8;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by rsingh on 4/3/14.
 */
public class JavaTime {

    public static void main(String[] args) {
        Instant start = Instant.now();

        Instant end = Instant.now();
        Duration length = Duration.between(end, start);
        System.out.println(length.toNanos());
    }


}
