import java.util.ArrayList;

public class User {

    String account;
    String Description;
    ArrayList<Post> posts = new ArrayList<Post>();

    public User(String account, String Description) {
        this.account = account;
        this.Description = Description;
    }

    public String getAccount() {
        return this.account;
    }

    public String getDescription() {
        return this.Description;
    }

    public String getDescription(String account) {
        if (this.account == account) {
            return this.Description;
        }
        return "";
    }

    public void addPost(String title, String nameofFile) {
        posts.add(new Post(title, nameofFile));
    }

}
