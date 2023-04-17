import java.util.ArrayList;

/**
 * The class represents a user saved in the Binary Search tree.
 * The User has 3 main attributes; a unique account name, a description and an
 * ArrayList of type Post
 */
public class User {

    String account;// stores a unique account name
    String Description;// contains the description for a unique account and provides extra information
                       // about the user.
    ArrayList<Post> posts = new ArrayList<Post>();// List where each element is of type Post

    /**
     * This is constructor 1 for User. It takes in 2 String variables {account} and
     * {description}
     * These 2 variables are assigned to their corresponding attributes
     * 
     * @param account     a unique account name
     * @param Description something which provides more information on the user.
     */
    public User(String account, String Description) {
        this.account = account;
        this.Description = Description;
    }

    /**
     * This is constructor 2 for User. It only takes in an account name from the
     * user and assigns it to the attribute {account}
     * 
     * @param account a unigue account name
     */
    public User(String account) {
        this.account = account;
    }

    /**
     * This method adds an object of type Post to the ArrayList named post.
     * It takes in 2 parameters, namely the title of the post and the name of the
     * file.
     * 
     * @param title      the comment or title of the post
     * @param nameofFile the video file name (including extension)
     */
    public void addPost(String title, String nameofFile) {
        posts.add(new Post(title, nameofFile));
    }

    /**
     * This is an overide method of addPost. Here it takes in 3 parameters, namely
     * the title of the post, the name of the file and the number of likes for that
     * post.
     * 
     * @param title      the comment or title of the post
     * @param nameofFile the video file name (including extension)
     * @param numLikes   the number of likes for a specific post
     */
    public void addPost(String title, String nameofFile, String numLikes) {
        posts.add(new Post(title, nameofFile, numLikes));
    }

    /**
     * This compareTo method invokes the String compareTo method. In order to sort
     * or find the users accordingly, the account names of 2 users will have to be
     * compared.
     * 
     * @param name the unique account name of the user.
     * @return 0 if the Strings are equal, less than 0 if {this.account} is less
     *         than {name} and greater than 0 if {this.account} is greater than
     *         {name}
     */
    public int compareTo(String name) {
        return this.account.compareTo(name);

    }

    /**
     * This returns the user name of the User account.
     */
    public String toString() {
        return this.account;
    }

}
