import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

        assertFalse("abcdefgh".contains("ijk"));

    }

    @Test
    void split_basic() {

        String string = "abc def ghi";
        String actualResult[] = string.split(" ");
        String[] expectedResult = new String[]{"abc25", "def", "ghi"};

        assertArrayEquals(expectedResult, actualResult);

    }

}
