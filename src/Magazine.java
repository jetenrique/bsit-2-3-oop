public class Magazine extends LibraryItem {
    public Magazine(String title, String editor) {
        super(title, editor);
    }

    @Override
    public String getBorrowingStatus() {
        return "Magazine: " + getTitle() + " (Available for borrowing)";
    }
}
