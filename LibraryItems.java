
public class LibraryItems {

    private String title, subject;
    private int datePublished, isbn;

    // CONSTRUCTOR
    public LibraryItems(String title, String subject, int datePublished, int isbn) {
        this.title = title;
        this.subject = subject;
        this.datePublished = datePublished;
        this.isbn = isbn;
    }

    // GETTERS

    public String getTitle() {
        return title;

    }

    public String getSubject() {
        return subject;
    }

    public int getDatePublished() {
        return datePublished;
    }

    public int isbn() {
        return isbn;
    }

    // SETTERS

    public void setAuthor(String title) {
        this.title = title;
    }

    public void setGenre(String subject) {
        this.subject = subject;

    }

    public void setDatePublished(int datePublished) {
        this.datePublished = datePublished;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}