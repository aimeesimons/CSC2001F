public class Post {
    String title;
    String nameOfFile;
    int numLikes;

    public Post() {
        this.title = null;
        this.nameOfFile = null;
        this.numLikes = 0;
    }

    public Post(String title, String nameOfFile) {
        this.title = title;
        this.nameOfFile = nameOfFile;
        this.numLikes = 0;
    }

    public Post(String title) {
        this.title = title;
        this.nameOfFile = "N/A";
        this.numLikes = 0;
    }

    public Post(String title, String nameOfFile, int numLikes) {
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
