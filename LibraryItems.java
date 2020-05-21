
public class LibraryItems {

    private String title, author, subject, ageGroup;
    private boolean availability; 
    private int datePublished, isbn;
}

// CONSTRUCTOR
public LibraryItems(String title, String author, String subject, String ageGroup, boolean availability, int datePublished, int isbn){
    this.title = title;
    this.author = author;
    this.subject = subject;
    this.ageGroup = ageGroup;
    this.availability = availability;
    this.datePublished = datePublished;
    this.isbn = isbn;
}


// GETTERS
public String getAuthor(){
    return author;
}

public String getGenre(){
    return genre;
}

public boolean getAvailability(){
    return available;
}

public int getDatePublished(){
    return datePublished;
}

// SETTERS

public void setAuthor(String author){
    this.author = author;
}

public void setGenre(String genre){
    this.genre = genre;

}

public void setAvailability(boolean availability){
    this.availability = availability;
}

public void setDatePublished(int datePublished){
    this.datePublished = datePublished
}








