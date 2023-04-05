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
        this.nameOfFile = "";
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
        String x = "Title: " + this.title + "\n";
        x = x + "Video: " + this.nameOfFile + "\n";
        x = x + "Number of Likes: " + this.numLikes;

        return x;
    }

}
