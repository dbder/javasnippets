package snippets.rxjava;

import io.reactivex.rxjava3.core.Observable;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JustTest {


    @Test
    void just()  {

        Observable<Integer> just = Observable.just(2, 3, 4);
        List<Integer> list = new ArrayList<>();
        just.subscribe(list::add);

        assertEquals("[2, 3, 4]", list.toString());
    }

}