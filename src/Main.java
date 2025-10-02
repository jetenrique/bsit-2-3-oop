public class Main {
    public static void main(String[] args) {
        System.out.println("═══ LIBRARY MANAGEMENT SYSTEM TEST ═══");

        System.out.println("\n══ Adding Items to Library ══");
        Book book = new Book("B1", "Java Programming", "James GosLing", "12345", 500, "Programming");
        Magazine mag = new Magazine("M1", "Tech Today", "Editor Smith", 101, "October", true);
        DVD dvd = new DVD("D1", "The Matrix", "Wachowski Sisters", 120, "R", "Sci-Fi");

        System.out.println("Added: Book - " + book.getItemInfo());
        System.out.println("Added: Magazine - " + mag.getItemInfo());
        System.out.println("Added: DVD - " + dvd.getItemInfo());

        LibraryManager manager = new LibraryManager();
        manager.addItem(book);
        manager.addItem(mag);
        manager.addItem(dvd);

        System.out.println("\n══ Displaying All Items ══");
        manager.displayAllItems();

        System.out.println("\n══ Testing Borrowing ══");
        Student student = new Student("S1", "John Smith", "john@email.com", "ST123", "Computer Science");
        Faculty faculty = new Faculty("F1", "Dr. Smith", "smith@email.com", "Engineering", "Professor");

        book.borrowItem(student.getName());
        student.addBorrowedItem(book);
        dvd.borrowItem(faculty.getName());
        faculty.addBorrowedItem(dvd);

        System.out.println("Student " + student.getName() + " borrowed: " + book.title);
        System.out.println("Faculty " + faculty.getName() + " borrowed: " + dvd.title);

        System.out.println("\n══ Displaying Available Items ══");
        manager.displayAvailableItems();

        System.out.println("\n══ Testing Late Fees ══");
        System.out.println("Java Programming - 5 days late: $" + book.calculateLateFee(5));
        System.out.println("The Matrix - 3 days late: $" + dvd.calculateLateFee(3));

        System.out.println("\n══ Testing User Information ══");
        System.out.println("Student: " + student.getName() + " (" + student.getMajor() + ") - " + student.getBorrowedItemsCount() + " items borrowed");
        System.out.println("Faculty: " + faculty.getName() + " (" + faculty.getDepartment() + ") - " + faculty.getBorrowedItemsCount() + " items borrowed");
    }
}
