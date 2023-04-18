import java.util.Random;

/**
 * This class stores 3 attributes of a post; being a title, name of file and
 * number of likes
 */
public class Post {
    String title;// The comment/title of the post
    String nameOfFile;// the file name (including its extension)
    String numLikes;// The number of likes a post receives.
    int likes = 10000;// maximum amount of likes

    Random rand = new Random();/// Random object initialisation

    /**
     * This is constructor 1 for Post.
     * It sets all attributes to null.
     */
    public Post() {
        this.title = null;
        this.nameOfFile = null;
        this.numLikes = null;
    }

    /**
     * This is constructor 2 for Post.
     * It sets the attributes title and nameOfFile from the input variables.
     * numLikes is randomly generated from the variable 'rand'. *
     * 
     * @param title      which is the comment or title of the post
     * @param nameOfFile the video file name (including extension)
     */
    public Post(String title, String nameOfFile) {
        this.title = title;
        this.nameOfFile = nameOfFile;
        this.numLikes = Integer.toString(rand.nextInt(likes));// generating a number between 0 and {likes}
    }

    /**
     * This is constructor 3 of Post.
     * It only takes in one variable from the user; being the comment or title of
     * the post.
     * Once again, the number of likes is randomly generated.
     * 
     * @param title the comment or title of post.
     */
    public Post(String title) {
        this.title = title;
        this.nameOfFile = "N/A";
        this.numLikes = Integer.toString(rand.nextInt(likes));// generating a number between 0 and {likes}
    }

    /**
     * This is construtor 4 of Post.
     * Here, it takes in three parameters from the user and assigns them to the
     * corresponding attributes.
     * 
     * @param title      the comment or title of the post.
     * @param nameOfFile the video file name (including extension).
     * @param numLikes   the number of likes for a specific post.
     */
    public Post(String title, String nameOfFile, String numLikes) {
        this.title = title;
        this.nameOfFile = nameOfFile;
        this.numLikes = numLikes;
    }

    /**
     * This is the toString method for Post.
     * It displays the title, an image of an ascii bunny, the video file, if any,
     * and the number of likes
     */
    public String toString() {
        String bunny = "(\\(\\\n";
        bunny = bunny + "\t|\t( . .)\n";
        bunny = bunny + "\t|\to_(\")(\")\n\t";
        String x = "|Comment:\"" + this.title + "\"\n";
        x = x + "\t|\t" + bunny + "|Video: " + this.nameOfFile + "\n";
        x = x + "\t|" + "Number of Likes: " + this.numLikes;

        return x;
    }

}
