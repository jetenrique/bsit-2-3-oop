public class Main {
    public static void main(String[] args) {
        System.out.println("═══ LIBRARY MANAGEMENT SYSTEM TEST ═══\n");

        System.out.println("══ Adding Items to Library ══");
        Book book = new Book("Java Programming", "James GosLing");
        Magazine magazine = new Magazine("Tech Today", "Editor Smith");
        DVD dvd = new DVD("The Matrix", "Wachowski Sisters");

        System.out.println("Added: Book - " + book.getTitle() + " by " + book.getCreator());
        System.out.println("Added: Magazine - " + magazine.getTitle() + " by " + magazine.getCreator());
        System.out.println("Added: DVD - " + dvd.getTitle() + " by " + dvd.getCreator());

        System.out.println("\n══ Displaying All Items ══");
        System.out.println(book.getBorrowingStatus());
        System.out.println(magazine.getBorrowingStatus());
        System.out.println(dvd.getBorrowingStatus());

        System.out.println("\n══ Testing Borrowing ══");
        Student student = new Student("John Smith", "Computer Science");
        Faculty faculty = new Faculty("Dr. Smith", "Engineering");

        student.borrowItem(book);
        faculty.borrowItem(dvd);

        System.out.println("Student John borrowed: " + book.getTitle());
        System.out.println("Faculty Dr. Smith borrowed: " + dvd.getTitle());

        System.out.println("\n══ Displaying Available Items ══");
        if (!magazine.isBorrowed()) {
            System.out.println("Magazine: " + magazine.getTitle() + " (Available for borrowing)");
        }

        System.out.println("\n══ Testing Late Fees ══");
        System.out.println(book.getTitle() + " - 5 days late: $" + LibraryManager.calculateLateFee(5, 0.50));
        System.out.println(dvd.getTitle() + " - 3 days late: $" + LibraryManager.calculateLateFee(3, 1.00));

        System.out.println("\n══ Testing User Information ══");
        System.out.println("Student: " + student.getName() + " (" + student.getDepartment() + ") - " + student.getBorrowedCount() + " items borrowed");
        System.out.println("Faculty: " + faculty.getName() + " (" + faculty.getDepartment() + ") - " + faculty.getBorrowedCount() + " items borrowed");
    }
}
