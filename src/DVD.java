  public class DVD extends LibraryItem {
    public DVD(String title, String director) {
        super(title, director);
    }

    @Override
    public String getBorrowingStatus() {
        return "DVD: " + getTitle() + " (DVD: Available for borrowing)";
    }
}
