package quotes;

public class Books {
    String author;
    String text;
    public Books(String author, String text) {
        this.author = author;
        this.text = text;
    }    public String getAuther() {
        return author;
    }    public String getText() {
        return text;
    }    @Override
    public String toString() {
        return "Books{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}