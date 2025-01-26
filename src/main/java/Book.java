//Prezentacja w klasie CalcAplication
public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public static Book of(String author, String title) {
        return new Book(author, title);
    }
}
