public interface Borrowable {
    boolean isBorrowed();
    void borrow();
    void returnItem();

    default String getBorrowingStatus() {
        return isBorrowed() ? "Currently borrowed" : "Available for borrowing";
    }
}
