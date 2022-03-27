package snippets.rxjava;


import io.reactivex.rxjava3.core.Observable;

public class App {

    static NetworkClient networkClient = new NetworkClient();

    static Observable<User> getUser(int userId) {
        return Observable.fromCallable(() ->
                networkClient.fetchUserId(userId));
    }

    static Observable<UserDetail> getUserDetail(User user) {
        return Observable.fromCallable(() ->
                networkClient.fetchUserDetail(user));
    }

    public static void main(String[] args) {

        Observable<User> user = getUser(123);
        Observable<UserDetail> userDetails = user.flatMap(App::getUserDetail);
        userDetails.subscribe(ud -> System.out.println("DOB: " + ud.DOB + ", Mother's name: " + ud.mothersMaidenName + "\n"));
    }
}
