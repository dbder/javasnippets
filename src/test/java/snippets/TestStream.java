package snippets;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestStream {


    @Test
        // use multiMap to combine filter and map to prevent extra operation
        // more efficient than flatmap
    void multiMap_canBeUsedToFilter() {
        //Given: A list of integers with a bad one
        var strings = List.of("1", "23", "three");

        //When: the list is multiMapped to integer
        var ints = strings.stream()
                .<Integer>mapMulti((s, stream) -> {
                    try {
                        stream.accept(Integer.parseInt(s));
                    } catch (NumberFormatException e) {
                    }
                })
                .toList();
        //Then: the result is all valid integers
        assertEquals(List.of(1, 23), ints);
    }


    @Test
        // don't use peek ( or any sideeffect in an intermediate method )
    void peek_doesNotTriggerOnCollectionCount() {
        //Given: a Collection
        var list = List.of(1, 2, 4);

        //When: I count the list by stream
        var memory = new ArrayList<Integer>();
        var count = list.stream()
                .peek(memory::add)
                .count();

        //Then: peek did not trigger
        assertEquals(0, memory.size());
        //And: count did trigger
        assertEquals(3, count);
    }
}
