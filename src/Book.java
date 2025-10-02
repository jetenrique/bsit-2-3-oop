public class Book extends LibraryItem {
    public Book(String title, String author) {
        super(title, author);
    }

    @Override
    public String getBorrowingStatus() {
        return "Book: " + getTitle() + " (Available for borrowing)";
    }
}
