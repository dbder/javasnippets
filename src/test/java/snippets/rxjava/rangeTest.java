package snippets.rxjava;

import io.reactivex.rxjava3.core.Observable;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class rangeTest {


    @Test
    void range() {
        var list = new ArrayList<Integer>();

        Observable.range(1,5).subscribe(list::add);

        assertEquals("[1, 2, 3, 4, 5]", list.toString());
    }

}
