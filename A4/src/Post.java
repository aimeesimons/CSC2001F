import java.util.Random;

public class Post {
    String title;
    String nameOfFile;
    String numLikes;
    int likes = 100000;

    Random rand = new Random();

    public Post() {
        this.title = null;
        this.nameOfFile = null;
        this.numLikes = null;
    }

    public Post(String title, String nameOfFile) {
        this.title = title;
        this.nameOfFile = nameOfFile;
        this.numLikes = Integer.toString(rand.nextInt(likes));
    }

    public Post(String title) {
        this.title = title;
        this.nameOfFile = "N/A";
        this.numLikes = Integer.toString(rand.nextInt(likes));
    }

    public Post(String title, String nameOfFile, String numLikes) {
        this.title = title;
        this.nameOfFile = nameOfFile;
        this.numLikes = numLikes;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNameOfFile(String nameOfFile) {
        this.nameOfFile = nameOfFile;
    }

    public void Update() {
        this.numLikes += 1;
    }

    public String toString() {
        String bunny = "(\\(\\\n";
        bunny = bunny + "\t( . .)\n";
        bunny = bunny + "\to_(\")(\")\t|\n\t\t\t";
        String x = "|Comment: " + this.title + "\n";
        x = x + "\t|" + bunny + "|Video: " + this.nameOfFile + "|\n";
        x = x + "\t|" + "Number of Likes: " + this.numLikes + "|";

        return x;
    }

}
