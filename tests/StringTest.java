import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StringTest {

    @Test
    void length_basic() {

        int actualLength = "ABCD".length();
        int expectedLength = 4;
        assertEquals(expectedLength, actualLength);

    }

    @Test
    void toUpperCase_basic() {

        String string = "abcd";
        String result = string.toUpperCase();

        assertEquals("ABCD", result);

    }

    @Test
    void contains_basic() {

        String string = "abcdefgh";
        boolean result = string.contains("ijk");

        assertFalse(result);

    }

}
