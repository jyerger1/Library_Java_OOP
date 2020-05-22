
public class Book extends LibraryItems implements Reservable, Loanable {

    public Author authorName;
    public LateCharges lateCharges;

    public Book(String title, String subject, int datePublished, int isbn, Author authorName) {
        super(title, subject, datePublished, isbn);

        this.authorName = authorName;

    }

    public Author getAuthor() {
        return authorName;
    }

    public void setAuthor(Author authorName) {
        this.authorName = authorName;
    }

    // Implementing methods from IReservable

    @Override
    public boolean isReservable() {
        return true;
    }

    @Override
    public boolean isLoanable() {
        return true;
    }
    
    @Override 
    public void lateFee(int days){
        int yourBill = fee * days;
        System.out.println(yourBill);
    }

    int fee = 0;
    public void setLateFee(){
        
        switch (this.lateCharges) {
            case DAILY:
                fee = 1;            
                break;
            case WEEKLY:
                fee = 5;
                break;
            case BIWEEKLY:
                fee = 7;
                break;
            case MONTHLY:
                fee = 15;
                break;    
            default:
            fee = 0;
                break;
        }
        System.out.println("Your late fees are: " + fee);

            
    }

}