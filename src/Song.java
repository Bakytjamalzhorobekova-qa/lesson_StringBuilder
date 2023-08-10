import java.io.FileWriter;
import java.util.WeakHashMap;

public class Song {
    private String title;
    private String author;
    private String text;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Song : " +"\n"+
                "title : '" + title+ "'" + '\n'+
                "author : '" + author+ "'" + '\n'+
                "text : '" + text + "'"+'\n'+
                ' ';
    }
}
