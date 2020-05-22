public class Library {
    public static void main(String[] args) {

        Author newAuthor = new Author("John", "Doe");
        Book book1 = new Book("title", "subject", 1990, 324, newAuthor);

        System.out.print(newAuthor.getAuthor());
        
    }
}