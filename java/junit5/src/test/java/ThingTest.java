import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThingTest {


    int romanToArabic(String romanNumber) {
        return 1;
    }


    @Test
    void it_should_parse_I_as_1() {
        assertEquals(1, romanToArabic("I"));
    }
}
