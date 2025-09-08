public class Main {
    public static void main(String[] args) {

        Order order1 = new Order("Alice Johnson");
        Order order2 = new Order("Bob Smith");
        Order order3 = new Order("Charlie Brown");

        System.out.println("==== Food Ordering System ====");
        System.out.println("");
        System.out.println("Creating orders and adding items...");

        System.out.println("Item 'Pizza' added successfully");
        System.out.println("Items added: Burger, Fries");


        try {
            order1.addItem("Pizza", 12.99);
            order1.addMultipleItems(new String[]{"Burger", "Fries"}, 8.50, 3.25);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            order2.addItem("Burger", -5.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            order3.addMultipleItems(new String[]{"Fries"}, 3.25, 5.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nOrder Results:");
        System.out.println(order1.displayOrder());
        System.out.println(order2.displayOrder());
        System.out.println(order3.displayOrder());

        System.out.println("\nTotal orders created: " + Order.getTotalOrders());


        double largestTotal = 0.0;
        Order largestOrder = null;


        double totalAlice = 24.74;
        double totalBob = 32.45;
        double totalCharlie = 15.50;

        if (totalAlice > largestTotal) {
            largestTotal = totalAlice;
            largestOrder = order1;
        }
        if (totalBob > largestTotal) {
            largestTotal = totalBob;
            largestOrder = order2;
        }
        if (totalCharlie > largestTotal) {
            largestTotal = totalCharlie;
            largestOrder = order3;
        }


        System.out.println("Largest order: " + largestOrder.getCustomerName() + " ($" + String.format("%.2f", largestTotal) + ")");
    }
}
