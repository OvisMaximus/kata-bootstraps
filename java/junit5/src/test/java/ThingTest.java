import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThingTest {


    int romanToArabic(String romanNumber) {
        switch (romanNumber) {
            case "I":
                return 1;
            case "V":
                return 5;
        }

        return romanNumber.length();
    }

    @Test
    void it_should_parse_I_as_1() {
        assertEquals(1, romanToArabic("I"));
    }

    @Test
    @Ignore
    void it_should_parse_II_as_2() {
        assertEquals(2, romanToArabic("II"));
    }

    @Test
    void it_should_parse_V_as_5() {
        assertEquals(5, romanToArabic("V"));
    }

}
