package snippets.rxjava;


import io.reactivex.rxjava3.core.Observable;

public class SimpleOnNext {

    public static void main(String[] args) {
        Observable<Integer> intObservable =
                Observable.create(e -> {
                    e.onNext(1);
                    e.onNext(2);
                    e.onNext(3);
                    e.onNext(4);
                    e.onNext(5);
                    e.onComplete();
                });

        intObservable.map(val -> val * 3)
                .filter(val -> val % 2 == 0)
                .subscribe(i -> {
                    // Will receive the following values in order: 6, 12
                    System.out.println(i);
                });

        intObservable.map(val -> val * 3)
                .filter(val -> val % 2 == 0)
                .subscribe(i -> {
                    // Will receive the following values in order: 6, 12
                    System.out.println(i);
                });
    }
}
