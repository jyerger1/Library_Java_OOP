import java.util.*;

public class CardHolder {
    private String firstName, lastName;
    private int libraryCardNum;
    
    List<String> overdueBooks = new ArrayList<String>();
   
    
    public CardHolder(){

    }

    // gets and sets

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public int getLibraryCardNum() {
        return libraryCardNum;
    }
    public void setLibraryCardNum(int libraryCardNum){
        this.libraryCardNum = libraryCardNum;
    }


}