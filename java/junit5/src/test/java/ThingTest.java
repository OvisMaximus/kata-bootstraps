import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThingTest {

    int romanToArabic(String romanNumber) {
        char c = romanNumber.charAt(0);
        return romanToArabic(c);
    }

    private int romanToArabic(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            default:
                return 0;
        }
    }

    //  @DisplayName("Roman numeral")
    @ParameterizedTest()
    @CsvSource({ "I, 1", "V, 5", "X, 10" })
    void it_should_parse_roman_to_arabic_number(String roman, int arabic) {
        assertEquals(arabic, romanToArabic(roman));
    }

}
