package snippets;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;

class TestList {

    @Test
        // Copy immutable lists for free
    void ListCopy_copyHasSameReference() {
        // Given: an Immutable list
        var list1 = List.of(1, 2, 3);

        // When: i copy the list with List.copyOf
        var list2 = List.copyOf(list1);

        // Then: the list is not copied but just the reference
        assertSame(list1, list2, "lists have same reference");
    }

}
