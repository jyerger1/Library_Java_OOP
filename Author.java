
public class Author {

    String firstName;
    String lastName;
    String author = lastName + firstName;

    public Author() {
        this.firstName = "John";
        this.lastName = "Doe";

    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getAuthor() {
        this.author = this.lastName + ", " + this.firstName;
        return author;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
