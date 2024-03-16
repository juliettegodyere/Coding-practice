package JavaDate;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantClass {
    public static void main(String[] args){
        Instant st = Instant.now();

        Instant st2 = Instant.now().minus(1, ChronoUnit.HOURS);

        System.out.println(st2);
    }
}
