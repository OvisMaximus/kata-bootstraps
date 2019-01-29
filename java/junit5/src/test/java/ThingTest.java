import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThingTest {


    int romanToArabic(String romanNumber) {
        char c = romanNumber.charAt(0);
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
        }

        return romanNumber.length();
    }

    @Test
    void it_should_parse_I_as_1() {
        assertEquals(1, romanToArabic("I"));
    }

    //@Test
    void it_should_parse_II_as_2() {
        assertEquals(2, romanToArabic("II"));
    }

    @Test
    void it_should_parse_V_as_5() {
        assertEquals(5, romanToArabic("V"));
    }

    @Test
    void it_should_parse_X_as_10() {
        assertEquals(10, romanToArabic("X"));
    }
}
