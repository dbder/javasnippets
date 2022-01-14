package snippets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestString {


    @Test
        // String has a .lines() method to stream it.
    void stringCanBeStreamed() {
        //Given: a string with multiple lines
        var string = "hey\ndid\nyou\nknow";

        //When: it's streamed with .lines() to a list
        var list = string
                .lines()
                .toList();

        //Then: the list size is equal to the lines
        assertEquals(4, list.size());

    }

}
