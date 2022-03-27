package snippets.rxjava;

import java.util.List;

public class User {
    final String username;
    final boolean hasBlog;
    final int id;
    UserDetail details;

    public User(String username){
        this.username = username;
        this.hasBlog = false;
        this.id = 0;
    }

    public User(String username, boolean hasBlog, int id){
        this.username = username;
        this.hasBlog = hasBlog;
        this.id =id;
    }

    public UserDetail getUserDetails(){
        return this.details;
    }

    public void setUserDetails(UserDetail ud){
        this.details = ud;
    }

}