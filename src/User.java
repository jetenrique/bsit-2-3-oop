public abstract class User {
    private String name;
    private String department;
    private int borrowedCount;

    public User(String name, String department) {
        this.name = name;
        this.department = department;
        this.borrowedCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void borrowItem(LibraryItem item) {
        item.borrow();
        borrowedCount++;
    }

    public int getBorrowedCount() {
        return borrowedCount;
    }
}
