package snippets.regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZerosTest {

    @Test
    void leadingZerosRemoved1() {
        String str = "00a";
        assertEquals("a", Zeros.stripLeadingZeros(str));
    }

    @Test
    void leadingZerosRemoved2() {
        String str = "001";
        assertEquals("1", Zeros.stripLeadingZeros(str));
    }

    @Test
    void leadingZerosRemovedMiddleUnaffected() {
        String str = "001001";
        assertEquals("1001", Zeros.stripLeadingZeros(str));
    }

    @Test
    void leadingZerosRemovedLastRemains() {
        String str = "0000";
        assertEquals("0", Zeros.stripLeadingZeros(str));
    }
}
