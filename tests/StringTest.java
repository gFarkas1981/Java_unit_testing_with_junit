import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {

    @BeforeAll
    static void beforeAll() {

        System.out.println("Intitialising connection to the database...\n");

    }

    @AfterAll
    static void afterAll() {

        System.out.println("\nClosing connection to the database...");

    }

    @BeforeEach
    void beforeEach(TestInfo info) {

        System.out.println("Initialise Test Data for " + info.getDisplayName());

    }

    @AfterEach
    void afterEach() {

        System.out.println("Clean up Test Data");

    }

    @Test
    void length_basic() {

        int actualLength = "ABCD".length();
        int expectedLength = 4;
        assertEquals(expectedLength, actualLength);

    }

    @Test
    void lengthGreaterThanZero() {

        assertTrue("ABCD".length() > 0);
        assertTrue("ABC".length() > 0);
        assertTrue("A".length() > 0);
        assertTrue("DEF".length() > 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"ABCD", "", "ABC", "A", "DEF"})
    void lengthGreaterThanZeroUsingParameterizedTest(String string) {

        assertTrue(string.length() > 0);

    }

    @Test
    @DisplayName("When length is null throw an exception")
    void length_exception() {

        String string = null;

        assertThrows(NullPointerException.class,

                () -> {

                    string.length();

                }

        );
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
        String[] expectedResult = new String[]{"abc", "def", "ghi"};

        assertArrayEquals(expectedResult, actualResult);

    }

}
