import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTest {

    @Test
    void test() {

        int actualLength = "ABCD".length();
        int expectedLength = 4;
        assertEquals(expectedLength, actualLength);

    }

}
