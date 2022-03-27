package snippets.rxjava;

import io.reactivex.rxjava3.core.Observable;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AsyncTest {


    @Test
    void thread() throws InterruptedException {
        Observable<Integer> integerObservable = Observable.create(src -> {
            new Thread(() -> {
                src.onNext(getNr(1));
                src.onNext(2);
                src.onNext(3);
                src.onComplete();
            }).start();
        });

        var list = new ArrayList<String>();
        integerObservable.subscribe(i -> list.add(String.valueOf(i)));

        list.add("Finished");
        Thread.sleep(50);
        assertEquals("[Finished, 1, 2, 3]", list.toString());
    }

    static int getNr(int nr) {
        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return nr;
    }
}
