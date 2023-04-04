public class Post {
    String title;
    String nameOfFile;
    int numLikes;

    public Post(){
        this.title = null;
        this.nameOfFile=null;
        this.numLikes=0;
    }

    public Post(String title, String nameOfFile, int numLikes){
        this.title = title;
        this.nameOfFile=nameOfFile;
        this.numLikes=numLikes;
    }

    public void setTitle(String title){
        this.title=title;
    }

    public void setNameOfFile(String nameOfFile){
        this.nameOfFile=nameOfFile;
    }
    public void Update(){
        this.numLikes += 1;
    }
}
