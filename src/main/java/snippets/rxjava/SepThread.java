package snippets.rxjava;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class SepThread {

    public static void main(String[] args) {

        Observable.just(1, 2, 3)
                .flatMap(value -> Observable.just(value).subscribeOn(Schedulers.io()))
                .doOnNext(value -> System.out.println(Thread.currentThread().getName() + " : " + value))
                .subscribe();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
