package snippets.rxjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class NetworkClient {
    Random random = new Random();

    User fetchUserId(int id) {
        randomSleep();

        User returnUser = new User("Aman", false, 121);
        User user1 = new User("Chris", false, 123);
        User user2 = new User("Jack", false, 124);
        User user3 = new User("Sierra", false, 125);
        user1.setUserDetails(new UserDetail("1/1/2000", "Emma", false, "none"));
        user2.setUserDetails(new UserDetail("1/1/2008", "Olivia", false, "none"));
        user3.setUserDetails(new UserDetail("1/1/2010", "Sophia", false, "none"));

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        for (User user : users) {
            if (user.id == id) {
                returnUser = user;
            }
        }

        return returnUser;

    }

    UserDetail fetchUserDetail(User usr) {
        randomSleep();

        if (usr.getUserDetails() == null) {
            usr.setUserDetails(new UserDetail("1/1/2000", "Amina", false, "none"));
        }
        return usr.getUserDetails();
    }

    void randomSleep() {
        try {
            Thread.sleep(random.nextInt(3) * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
