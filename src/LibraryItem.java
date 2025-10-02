public abstract class LibraryItem implements Borrowable {
    private String title;
    private String creator;
    private boolean borrowed;

    public LibraryItem(String title, String creator) {
        this.title = title;
        this.creator = creator;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getCreator() {
        return creator;
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public void borrow() {
        borrowed = true;
    }

    @Override
    public void returnItem() {
        borrowed = false;
    }
}
