import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Disabled
public class MathTest {

    @Test
    void test() {

        int actualNumber = Math.abs(-823);
        int expectedNumber = 823;

        assertEquals(expectedNumber, actualNumber);

    }

}
