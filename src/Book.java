public class Book {

    String title;
    String author;
    int pages;
    boolean isAvailable;


    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;
        System.out.println("A new book '" + title + "' by " + author + " has been created!");
    }


    public void displayInfo() {
        System.out.println("     Book Info     ");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public void borrowBook() {
        if (!isAvailable) {
            System.out.println(title + " is not available to borrow.");
        } else {
            System.out.println("You have borrowed '" + title + "'. Please return it soon. Happy reading");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned the book " + title + ", Thank you!");
        } else {
            System.out.println(title + " is not borrowed by someone.");
        }
    }


    public static void main(String[] args) {
        Book book1 = new Book("Chess", "Jose Enrique", 315);
        Book book2 = new Book("Kicks", "Kyrie Nicole", 646);
        Book book3 = new Book("Seller", "Gela Mae", 169);

        System.out.println();

        book1.displayInfo();
        book1.borrowBook();
        book1.displayInfo();
        book1.returnBook();
        book1.displayInfo();

        System.out.println();

        book2.displayInfo();
        book3.displayInfo();
    }
}
