public class User {

    String account;
    String Description;
    Post[] posts;

    public User(String account, String Description){
        this.account = account;
        this.Description= Description;
        this.posts = new Post[10];
    }

    
}
